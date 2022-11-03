package DelegationPattern

class Downloads:Download{
    override fun downloaded() {
        println("The message is download")
    }

}
class Players:Player{
    override fun players() {
        println("Players...")
    }

}
class Delegation:Download,Player{
    val downloaders:Download = Downloads()
    val players:Player=Players()
    override fun downloaded() {
        downloaders.downloaded()
    }

    override fun players() {
     players.players()
    }

}
fun main() {
    val delegations = Delegation()
    delegations.downloaded()
    delegations.players()
}