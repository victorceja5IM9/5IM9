import java.util.*;
public class Des {
    public static void main(String[] args) {
        ArrayList<String> claves = new ArrayList<String>();
        String E0;
        LlavesDes obt=new LlavesDes();
        devolverClave clav=new devolverClave();
        obt.dividirYObtenerC0D0();
        claves.add(obt.k1);claves.add(obt.k2);claves.add(obt.k3);claves.add(obt.k4);
        claves.add(obt.k5);claves.add(obt.k6);claves.add(obt.k7);
        claves.add(obt.k8);claves.add(obt.k9);claves.add(obt.k10);
        claves.add(obt.k11);claves.add(obt.k12);claves.add(obt.k13);
        claves.add(obt.k14);claves.add(obt.k15);claves.add(obt.k16);
        clav.devolverClave();
        String ip="";
        String L0="",R0="",AuxL0="",AuxR0="";
        for (int j = 0; j < 16; j++) {
            if(j==0){
                ip=clav.clav2;
            }
            else{
                ip=L0+R0;
            }
            for (int i = 0; i < 32; i++) {
                AuxL0=AuxL0+ip.charAt(i);
            }
            L0=AuxL0;
            AuxL0="";
            for (int i = 32; i < 64; i++) {
                AuxR0=AuxR0+ip.charAt(i);
            }
            R0=AuxR0;
            AuxR0="";
            E0=""+
                R0.charAt(31)+R0.charAt(0)+R0.charAt(1)+R0.charAt(2)+R0.charAt(3)+R0.charAt(4)+
                R0.charAt(3)+R0.charAt(4)+R0.charAt(5)+R0.charAt(6)+R0.charAt(7)+R0.charAt(8)+
                R0.charAt(7)+R0.charAt(8)+R0.charAt(9)+R0.charAt(10)+R0.charAt(11)+R0.charAt(12)+
                R0.charAt(11)+R0.charAt(12)+R0.charAt(13)+R0.charAt(14)+R0.charAt(15)+R0.charAt(16)+
                R0.charAt(15)+R0.charAt(16)+R0.charAt(17)+R0.charAt(18)+R0.charAt(19)+R0.charAt(20)+
                R0.charAt(19)+R0.charAt(20)+R0.charAt(21)+R0.charAt(22)+R0.charAt(23)+R0.charAt(24)+
                R0.charAt(23)+R0.charAt(24)+R0.charAt(25)+R0.charAt(26)+R0.charAt(27)+R0.charAt(28)+
                R0.charAt(27)+R0.charAt(28)+R0.charAt(29)+R0.charAt(30)+R0.charAt(31)+R0.charAt(0);
            int a=0;
            String f="";
            int b=0;
            String XOR="";
            String obtener_claves="";
            for (int i = 0; i < E0.length(); i++) {
                f= E0.charAt(i)+"";  
                obtener_claves= claves.get(j).charAt(i)+""; 
                a=Integer.parseInt(f);
                b=Integer.parseInt(obtener_claves);
                XOR=XOR+(a^b);
            }
            String S1,S2,S3,S4,S5,S6,S7,S8;
            S1=""+XOR.charAt(0) +XOR.charAt(1)+XOR.charAt(2)+XOR.charAt(3)+XOR.charAt(4)+XOR.charAt(5);
            S2=""+XOR.charAt(6) +XOR.charAt(7)+XOR.charAt(8)+XOR.charAt(9)+XOR.charAt(10)+XOR.charAt(11);
            S3=""+XOR.charAt(12)+XOR.charAt(13)+XOR.charAt(14)+XOR.charAt(15)+XOR.charAt(16)+XOR.charAt(17);
            S4=""+XOR.charAt(18)+XOR.charAt(19)+XOR.charAt(20)+XOR.charAt(21)+XOR.charAt(22)+XOR.charAt(23);
            S5=""+XOR.charAt(24)+XOR.charAt(25)+XOR.charAt(26)+XOR.charAt(27)+XOR.charAt(28)+XOR.charAt(29);
            S6=""+XOR.charAt(30)+XOR.charAt(31)+XOR.charAt(32)+XOR.charAt(33)+XOR.charAt(34)+XOR.charAt(35);
            S7=""+XOR.charAt(36)+XOR.charAt(37)+XOR.charAt(38)+XOR.charAt(39)+XOR.charAt(40)+XOR.charAt(41);
            S8=""+XOR.charAt(42)+XOR.charAt(43)+XOR.charAt(44)+XOR.charAt(45)+XOR.charAt(46)+XOR.charAt(47);
            Sustituciones sust=new Sustituciones();
            String Sustituciones=sust.S1(S1)+sust.S2(S2)+sust.S3(S3)+sust.S4(S4)+sust.S5(S5)+sust.S6(S6)+sust.S7(S7)+sust.S8(S8);
            String Funcion="";
            Funcion=""+
                    Sustituciones.charAt(15)+Sustituciones.charAt(6)+Sustituciones.charAt(19)+Sustituciones.charAt(20)+
                    Sustituciones.charAt(28)+Sustituciones.charAt(11)+Sustituciones.charAt(27)+Sustituciones.charAt(16)+
                    Sustituciones.charAt(0) +Sustituciones.charAt(14)+Sustituciones.charAt(22)+Sustituciones.charAt(25)+
                    Sustituciones.charAt(4) +Sustituciones.charAt(17)+Sustituciones.charAt(30)+Sustituciones.charAt(9)+
                    Sustituciones.charAt(1) +Sustituciones.charAt(7) +Sustituciones.charAt(23)+Sustituciones.charAt(13)+
                    Sustituciones.charAt(31)+Sustituciones.charAt(26)+Sustituciones.charAt(2)+Sustituciones.charAt(8)+
                    Sustituciones.charAt(18)+Sustituciones.charAt(12)+Sustituciones.charAt(29)+Sustituciones.charAt(5)+
                    Sustituciones.charAt(21)+Sustituciones.charAt(10)+Sustituciones.charAt(3)+Sustituciones.charAt(24);
            int c=0;
            String h="";
            int d=0;
            String XorHecho2="";
            String g="";
            for (int i = 0; i < L0.length(); i++) {
                h= Funcion.charAt(i)+"";  
                g= L0.charAt(i)+""; 
                c=Integer.parseInt(g);
                d=Integer.parseInt(h);
                XorHecho2=XorHecho2+(c^d);
            }
            L0=R0;
            R0=XorHecho2;
            
        }
        String concatenado=R0+L0;
        String cifrado="";
        cifrado=""+
                concatenado.charAt(39)+concatenado.charAt(7)+concatenado.charAt(47)+concatenado.charAt(15)+concatenado.charAt(55)+concatenado.charAt(23)+concatenado.charAt(63)+concatenado.charAt(31)+
                concatenado.charAt(38)+concatenado.charAt(6)+concatenado.charAt(46)+concatenado.charAt(14)+concatenado.charAt(54)+concatenado.charAt(22)+concatenado.charAt(62)+concatenado.charAt(30)+
                concatenado.charAt(37)+concatenado.charAt(5)+concatenado.charAt(45)+concatenado.charAt(13)+concatenado.charAt(53)+concatenado.charAt(21)+concatenado.charAt(61)+concatenado.charAt(29)+
                concatenado.charAt(36)+concatenado.charAt(4)+concatenado.charAt(44)+concatenado.charAt(12)+concatenado.charAt(52)+concatenado.charAt(20)+concatenado.charAt(60)+concatenado.charAt(28)+
                concatenado.charAt(35)+concatenado.charAt(3)+concatenado.charAt(43)+concatenado.charAt(11)+concatenado.charAt(51)+concatenado.charAt(19)+concatenado.charAt(59)+concatenado.charAt(27)+
                concatenado.charAt(34)+concatenado.charAt(2)+concatenado.charAt(42)+concatenado.charAt(10)+concatenado.charAt(50)+concatenado.charAt(18)+concatenado.charAt(58)+concatenado.charAt(26)+
                concatenado.charAt(33)+concatenado.charAt(1)+concatenado.charAt(41)+concatenado.charAt(9)+concatenado.charAt(49)+concatenado.charAt(17)+concatenado.charAt(57)+concatenado.charAt(25)+
                concatenado.charAt(32)+concatenado.charAt(0)+concatenado.charAt(40)+concatenado.charAt(8)+concatenado.charAt(48)+concatenado.charAt(16)+concatenado.charAt(56)+concatenado.charAt(24);
        
        System.out.println("La clave cifrada es: "+cifrado );
    } 
}
