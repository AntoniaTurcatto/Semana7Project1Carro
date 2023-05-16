class Carro {
    //modelo, marca, ano e preço.
    var modelo : String = ""
    var marca :String = ""
    var ano :Int = 0
    var preco :Float=0f

    constructor(modelo:String, marca:String, ano :Int, preco: Float ){
        this.modelo=modelo.uppercase()
        this.marca=marca.uppercase()
        this.ano=ano
        this.preco=preco
    }
}