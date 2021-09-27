pipeline{

    agent any
   
    stages{
        stage("Descargar el código de la aplicación"){
            steps{
             git "https://github.com/evagutierrezacc/facturas-spring-rest.git"
            }
        }

        stage("Compilar y empaquetar el proyecto"){
            steps{
                bat "mvn clean package"
            }
        }
        stage("Crear imagen docker"){
            steps{

                bat "docker build -t evagutierrez/app-java ."
                
            }
        }
        stage("Crear contenedor docker"){
            steps{

                bat "docker run -d --name app-java -p 8081:8080 evagutierrez/app-java"
                
            }
        }
            stage ("Cerrar recursos"){
           
            steps {
                bat "docker stop app-java"
                bat "docker container rm app-java"
                bat "docker image rm evagutierrez/app-java"

            }

        }
    }

    post{
        success{
            echo 'Se ha dockerizado con éxito la aplicacion'
        }
    }

}
