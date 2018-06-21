package Structure;

import com.google.gson.annotations.SerializedName;

import static android.R.attr.password;

/**
 * Created by claytonandrade on 25/05/17.
 */

public class Usuarios {

    @SerializedName("nomeDoUsuario")
    private String nomeDoUsuario;
    private String sobrenome;
    private String password;
    private String cpf;
    private String cidadeTexto;
    private String estadoTexto;

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidadeTexto() {
        return cidadeTexto;
    }

    public void setCidadeTexto(String cidadeTexto) {
        this.cidadeTexto = cidadeTexto;
    }

    public String getEstadoTexto() {
        return estadoTexto;
    }

    public void setEstadoTexto(String estadoTexto) {
        this.estadoTexto = estadoTexto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
