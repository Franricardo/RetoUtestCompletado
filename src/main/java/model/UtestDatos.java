package model;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class UtestDatos {



    private  String strNombre; private String strApellido; private String strEmail;
    private String strMesNacimiento; private String strDiaNacimiento;private String strAnoNacimiento;
    private String strCiudad; private String strZIP;private String strPais;
    private String strDispositivoMovil; private String StrModeloMovil;private String strSistemaOperativoMovil;
    private String strClave;
    private String strTextoFinal;



    public UtestDatos(String strNombre, String strApellido, String strEmail,
                    String strMesNacimiento, String strDiaNacimiento, String strAnoNacimiento,
                    String strCiudad, String strZIP, String strPais,
                      String strDispositivoMovil, String strModeloMovil, String strSistemaOperativoMovil,
                    String strClave, String strTextoFinal
    ){
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strMesNacimiento = strMesNacimiento;
        this.strDiaNacimiento = strDiaNacimiento;
        this.strAnoNacimiento = strAnoNacimiento;
        this.strCiudad = strCiudad;
        this.strZIP = strZIP;
        this.strPais = strPais;
        this.strDispositivoMovil = strDispositivoMovil;
        this.StrModeloMovil = strModeloMovil;
        this.strSistemaOperativoMovil = strSistemaOperativoMovil;
        this.strClave = strClave;
        this.strTextoFinal = strTextoFinal;
    }


    public String getStrNombre() {
        return strNombre;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public String getStrMesNacimiento() { return strMesNacimiento; }

    public String getStrDiaNacimiento() { return strDiaNacimiento;}

    public String getStrAnoNacimiento() { return strAnoNacimiento; }

    public String getStrCiudad() {return strCiudad;}

    public String getStrZIP() {return strZIP;}

    public String getStrPais() {return strPais;}

    public String getStrDispositivoMovil() {return strDispositivoMovil;}

    public String getStrModeloMovil() {return StrModeloMovil;}

    public String getStrSistemaOperativoMovil() {return strSistemaOperativoMovil;}

    public String getStrClave() {return strClave;}

    public String getStrTextoFinal() {return strTextoFinal;}

    @DataTableType
    public static UtestDatos authorEntryTransformer(Map<String, String> entry) {
        return  new UtestDatos(
                entry.get("strNombre"),
                entry.get("strApellido"),
                entry.get("strEmail"),
                entry.get("strMesNacimiento"),
                entry.get("strDiaNacimiento"),
                entry.get("strAnoNacimiento"),
                entry.get("strCiudad"),
                entry.get("strZIP"),
                entry.get("strPais"),
                entry.get("strDispositivoMovil"),
                entry.get("strModeloMovil"),
                entry.get("strSistemaOperativoMovil"),
                entry.get("strClave"),
                entry.get("strTextoFinal")
        );
    }




}
