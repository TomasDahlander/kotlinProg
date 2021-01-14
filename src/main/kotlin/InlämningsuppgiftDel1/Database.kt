package InlämningsuppgiftDel1;

class Database() {
    val list = listOf(
        Question("Huvudingrediensen i paella?",
            "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 1),
        Question("Huvudingrediensen i Janssons Frestelse?",
            "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 0),
        Question("Vilken person levde på 1300-talet?",
            "Birger Jarl", "Karl XII", "Gustav III", "Gustav Adolf", Category.HISTORY, 0),
        Question("Vilket är inte ett grundämne?",
            "Kalium", "Väte", "Silver", "Vatten", Category.CHEMISTRY, 3),
        Question("Vilket är inte ett grundämne?",
            "Kväve", "Flour", "Couscous", "Guld", Category.CHEMISTRY, 2),
        Question("Huvudingrediensen i risotto?",
            "Potatis", "Ris", "Couscous", "Bröd", Category.FOOD, 1)
    )
    get() {
        return field
    }
}

