require 'date'

def encabezado_pgm
  
  nombre = "Carlos Steven Lozano Quintero"
  campus = "Campus Cali, U. Cooperativa de Colombia"
  repositorio_git = "https://github.com/carlosste/Estructura_De_Datos"

 
  fecha_hora = Time.now.strftime("%d/%m/%Y %H:%M:%S")

 
  puts
  puts "+----------------------------------------"
  puts "| 👤 Nombre: #{nombre}"
  puts "| 🎓 Campus: #{campus}"
  puts "| 📅 Fecha y hora: #{fecha_hora}"
  puts "| 📂 Repositorio Git: #{repositorio_git}"
  puts "+----------------------------------------"
  puts
end