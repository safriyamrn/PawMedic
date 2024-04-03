import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.paymentpawmedic.database.ProductContract

class ProductDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        val SQL_CREATE_PRODUCTS_TABLE = """
            CREATE TABLE ${ProductContract.ProductEntry.TABLE_NAME} (
                ${ProductContract.ProductEntry.COLUMN_NAME_ID} INTEGER PRIMARY KEY,
                ${ProductContract.ProductEntry.COLUMN_NAME_NAME} TEXT,
                ${ProductContract.ProductEntry.COLUMN_NAME_PRICE} REAL,
                ${ProductContract.ProductEntry.COLUMN_NAME_IMAGE_URL} TEXT,
                ${ProductContract.ProductEntry.COLUMN_NAME_DETAIL} TEXT
            )
        """.trimIndent()
        db.execSQL(SQL_CREATE_PRODUCTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS ${ProductContract.ProductEntry.TABLE_NAME}")
        onCreate(db)
    }

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "Product.db"
    }
}
