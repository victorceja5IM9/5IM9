/**
 *
 * @author Vicas Ceja
 */
import java.util.*;
public class Des {
    public static void main(String[] args) {
        ArrayList<String> keys = new ArrayList<String>();
        String E0;
        LlavesDes obt=new LlavesDes();
        devolverClave clav=new devolverClave();
        obt.dividirYObtenerC0D0();
        keys.add(obt.k1);keys.add(obt.k2);keys.add(obt.k3);keys.add(obt.k4);
        keys.add(obt.k5);keys.add(obt.k6);keys.add(obt.k7);keys.add(obt.k8);
        keys.add(obt.k9);keys.add(obt.k10);keys.add(obt.k11);keys.add(obt.k12);
        keys.add(obt.k13);keys.add(obt.k14);keys.add(obt.k15);keys.add(obt.k16);
        clav.devolverClave();
        String ayudita="";
        String L0="",R0="",AuxL0="",AuxR0="";
        for (int j = 0; j < 16; j++) {
            if(j==0){
                ayudita=clav.clav2;
            }
            else{
                ayudita=L0+R0;
            }
            for (int i = 0; i < 32; i++) {
                AuxL0=AuxL0+ayudita.charAt(i);
            }
            L0=AuxL0;
            AuxL0="";
            for (int i = 32; i < 64; i++) {
                AuxR0=AuxR0+ayudita.charAt(i);
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
            String obtener_keys="";
            for (int i = 0; i < E0.length(); i++) {
                f= E0.charAt(i)+"";  
                obtener_keys= keys.get(j).charAt(i)+""; 
                a=Integer.parseInt(f);
                b=Integer.parseInt(obtener_keys);
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
        String unir=R0+L0;
        String cifrado="";
        cifrado=""+
                unir.charAt(39)+unir.charAt(7)+unir.charAt(47)+unir.charAt(15)+unir.charAt(55)+unir.charAt(23)+unir.charAt(63)+unir.charAt(31)+
                unir.charAt(38)+unir.charAt(6)+unir.charAt(46)+unir.charAt(14)+unir.charAt(54)+unir.charAt(22)+unir.charAt(62)+unir.charAt(30)+
                unir.charAt(37)+unir.charAt(5)+unir.charAt(45)+unir.charAt(13)+unir.charAt(53)+unir.charAt(21)+unir.charAt(61)+unir.charAt(29)+
                unir.charAt(36)+unir.charAt(4)+unir.charAt(44)+unir.charAt(12)+unir.charAt(52)+unir.charAt(20)+unir.charAt(60)+unir.charAt(28)+
                unir.charAt(35)+unir.charAt(3)+unir.charAt(43)+unir.charAt(11)+unir.charAt(51)+unir.charAt(19)+unir.charAt(59)+unir.charAt(27)+
                unir.charAt(34)+unir.charAt(2)+unir.charAt(42)+unir.charAt(10)+unir.charAt(50)+unir.charAt(18)+unir.charAt(58)+unir.charAt(26)+
                unir.charAt(33)+unir.charAt(1)+unir.charAt(41)+unir.charAt(9)+unir.charAt(49)+unir.charAt(17)+unir.charAt(57)+unir.charAt(25)+
                unir.charAt(32)+unir.charAt(0)+unir.charAt(40)+unir.charAt(8)+unir.charAt(48)+unir.charAt(16)+unir.charAt(56)+unir.charAt(24);
        
        System.out.println("La clave cifrada es: "+cifrado );
    } 
}