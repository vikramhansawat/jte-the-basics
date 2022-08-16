void call(){
    stage("Maven: Build"){
        println "build from the maven library"
        hello()
    }
}

void hello(){
    println "inside hello function"
}
