package com.example.jouda

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Handle bottom menu clicks
        findViewById<TextView>(R.id.nav_products).setOnClickListener {
            showProducts()
        }
        findViewById<TextView>(R.id.nav_experts).setOnClickListener {
            Toast.makeText(this, "قائمة الخبراء الزراعيين", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.nav_equipment).setOnClickListener {
            Toast.makeText(this, "المعدات الفلاحية", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.nav_land).setOnClickListener {
            Toast.makeText(this, "أراضي زراعية للكراء", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.nav_offers).setOnClickListener {
            Toast.makeText(this, "العروض المميزة", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.nav_ads).setOnClickListener {
            Toast.makeText(this, "الإعلانات", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.nav_notifications).setOnClickListener {
            showNotifications()
        }
        findViewById<TextView>(R.id.nav_account).setOnClickListener {
            showSettings()
        }
    }

    private fun showProducts() {
        val categories = arrayOf("فواكه", "خضر", "عسل", "تمور", "حبوب", "شتلات")
        AlertDialog.Builder(this)
            .setTitle("منتجات الفلاحين")
            .setItems(categories) { _, which ->
                val selected = categories[which]
                Toast.makeText(this, "عرض منتجات: $selected", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    private fun showNotifications() {
        val messages = arrayOf(
            "موسم الطماطم يبدأ خلال 10 أيام – حضر محصولك",
            "لا تروِ المزروعات غداً – أمطار مرتقبة بنسبة 70%",
            "انضم فلاح جديد من ولاية وهران",
            "تغير في سعر التمور: 800 دج/كلغ"
        )
        AlertDialog.Builder(this)
            .setTitle("إشعارات")
            .setItems(messages, null)
            .show()
    }

    private fun showSettings() {
        val settings = arrayOf(
            "الصفحة الرئيسية",
            "اطلب منتجك",
            "إبلاغ عن مشكلة",
            "المنتدى",
            "اللغة",
            "حول التطبيق",
            "إضافة صورة",
            "تسجيل الخروج"
        )
        AlertDialog.Builder(this)
            .setTitle("الإعدادات")
            .setItems(settings) { _, i ->
                Toast.makeText(this, "تم اختيار: ${settings[i]}", Toast.LENGTH_SHORT).show()
            }
            .show()
    }
}
