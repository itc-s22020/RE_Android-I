package jp.ac.it_college.std.s22020.intentsample

data class Menu(val name: String, val price: Int)

val menuList = listOf(
    Menu("から揚げ定食", 800),
    Menu("ハンバーグ定食", 850),
    Menu("生姜焼き定食", 850),
    Menu("ステーキ定食", 1000),
    Menu("野菜炒め定食", 750),
    Menu("とんかつ定食", 900),
    Menu("ミンチかつ定食", 850),
    Menu("チキンカツ定食", 900),
    Menu("コロッケ定食", 850),
    Menu("回鍋肉定食", 750),
    Menu("麻婆豆腐定食", 800),
    Menu("青椒肉絲定食", 900),
    Menu("焼き魚定食", 850),
    Menu("焼肉定食", 950),
)