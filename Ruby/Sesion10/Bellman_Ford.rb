require 'csv'
require './Base'

def cargar_grafo_bellman(archivo)
  grafo = Hash.new { |h, k| h[k] = {} }
  CSV.foreach(archivo, headers: true) do |row|
    origen, destino, peso = row['Origen'], row['Destino'], row['Peso']
    if origen.nil? || destino.nil? || peso.nil? || !peso.match?(/^\d+(\.\d+)?$/)
      raise "Error en el archivo CSV: fila inválida #{row.inspect}"
    end
    grafo[origen][destino] = peso.to_f
  end
  grafo
end

def bellman_ford(grafo, inicio)
  nodos = grafo.keys | grafo.values.flat_map(&:keys)
  dist = Hash.new(Float::INFINITY)
  dist[inicio] = 0

  (nodos.size - 1).times do
    grafo.each do |u, adyacentes|
      adyacentes.each do |v, peso|
        if dist[u] + peso < dist[v]
          dist[v] = dist[u] + peso
        end
      end
    end
  end

  # Verificar ciclos negativos
  grafo.each do |u, adyacentes|
    adyacentes.each do |v, peso|
      if dist[u] + peso < dist[v]
        raise "Ciclo negativo detectado entre #{u} y #{v}"
      end
    end
  end

  dist
end

archivo = 'grafo_bellman.csv'
grafo = cargar_grafo_bellman(archivo)

if grafo.empty?
  puts "El grafo está vacío. Verifica el archivo CSV."
  exit
end

inicio = 'USD'
unless grafo.key?(inicio)
  puts "El nodo inicial '#{inicio}' no existe en el grafo."
  exit
end

encabezado_pgm

puts bellman_ford(grafo, inicio)