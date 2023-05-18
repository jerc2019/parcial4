package DB;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;


public class contactos extends DB {

    Context context;

    public contactos(@Nullable Context context) {
        super(context);
        this.context = context;
    }
    public long insertar(String Nombres, String Apellidos, String DireccionCliente,String CiUdadCliente) {

        long Cliente = 0;

        try {
            contactos  baseHelper= new contactos(context);
            SQLiteDatabase db = baseHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("Nombres", Nombres);
            values.put("Apellidos", Apellidos);
            values.put("DireccionCliente", DireccionCliente);
            values.put("CiUdadCliente", CiUdadCliente);

            Cliente = db.insert(TABLA_CONTACTOS, null, values);
        } catch (Exception ex) {
            ex.toString();
        }

        return  Cliente;
    }
}


