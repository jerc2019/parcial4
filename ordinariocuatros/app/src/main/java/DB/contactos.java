package DB;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

public class contactos extends DB {

    Context context;

    public contactos(@Nullable Context context){
        super(context);
        this.context = context;
    }


    public long insertarContacto(String sNombreCliente, String sApellidoCliente, String sDireccionCliente, String sCiudadCliente) {
        long id = 0;
        try {
            DB dbHelper = new DbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("sNombreCliente", sNombreCliente);
            values.put("sApellidoCliente", sApellidoCliente);
            values.put("sDireccionCliente", sDireccionCliente);
            values.put("sCiudadCliente", sCiudadadCliente);

            id = db.insert(TABLE_CONTACTOS, null, values);
        } catch (Exception ex) {
            ex.toString();
        }
        return id;
    }
}
