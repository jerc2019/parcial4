package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NOMBRE ="parcial";
    private static final String CLIENTES ="MD_Clientes";

    public DB(@Nullable Context context ) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + CLIENTES + "(" +
                "ID_CLIENTE INTEGER PRIMARY KEY AUTOINCREMENT," +
                "sNombreCliente text not null," +
                "sApellidoCliente text not null," +
                "sDireccionCliente text not null," +
                "sCiudadCliente text not null)" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
