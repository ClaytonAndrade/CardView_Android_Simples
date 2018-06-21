package interf;

import java.util.Map;

import Structure.Usuarios;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by claytonandrade on 25/05/17.
 */

public interface Endpoint {
    @GET("usuario/buscar")
    Call<Boolean> buscarUsuario (@QueryMap Map<String, String> param);

    @POST("usuario/inserir")
    Call<Boolean>inserirUsuario(@Body Usuarios usuario);
}
