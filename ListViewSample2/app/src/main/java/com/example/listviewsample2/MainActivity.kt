package com.example.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu: ListView = findViewById(R.id.lvMenu)

        var menuList = mutableListOf("田中角栄", "山本権兵衛", "黒田清隆", "伊藤博文", "林銑十郎", "岸田文雄", "安倍晋三", "宮沢喜一", "岸信介", "東条英機",
        "佐藤栄作", "東久邇宮稔彦王", "菅直人", "近衛文麿", "高橋是清", "三木武夫")

        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, menuList)

        lvMenu.adapter = adapter

        lvMenu.onItemClickListener = ListItemClickLitener()
    }

    private inner class ListItemClickLitener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
           val dialogFragment = OrderConfirmDialogFragment()
            dialogFragment.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
}