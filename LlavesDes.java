/**
 *
 * @author Vicas Ceja
 */
import java.util.*;

public class LlavesDes {

    Scanner vicas = new Scanner(System.in);
    String clave = "0001001100110100010101110111100110011011101111001101111111110001";
    char no1 = clave.charAt(56), no2 = clave.charAt(48), no3 = clave.charAt(40), no4 = clave.charAt(32), no5 = clave.charAt(24), no6 = clave.charAt(16), no7 = clave.charAt(8), no8 = clave.charAt(0);
    char no9 = clave.charAt(57), no10 = clave.charAt(49), no11 = clave.charAt(41), no12 = clave.charAt(33), no13 = clave.charAt(25), no14 = clave.charAt(17), no15 = clave.charAt(9), no16 = clave.charAt(1);
    char no17 = clave.charAt(58), no18 = clave.charAt(50), no19 = clave.charAt(42), no20 = clave.charAt(34), no21 = clave.charAt(26), no22 = clave.charAt(18), no23 = clave.charAt(10);
    char no24 = clave.charAt(2), no25 = clave.charAt(59), no26 = clave.charAt(51), no27 = clave.charAt(43), no28 = clave.charAt(35), no29 = clave.charAt(62);
    char no30 = clave.charAt(54), no31 = clave.charAt(46), no32 = clave.charAt(38), no33 = clave.charAt(30);
    char no34 = clave.charAt(22), no35 = clave.charAt(14), no36 = clave.charAt(6), no37 = clave.charAt(61), no38 = clave.charAt(53), no39 = clave.charAt(45);
    char no40 = clave.charAt(37), no41 = clave.charAt(29), no42 = clave.charAt(21), no43 = clave.charAt(13), no44 = clave.charAt(5), no45 = clave.charAt(60);
    char no46 = clave.charAt(52), no47 = clave.charAt(44), no48 = clave.charAt(36), no49 = clave.charAt(28), no50 = clave.charAt(20), no51 = clave.charAt(12);
    char no52 = clave.charAt(4), no53 = clave.charAt(27), no54 = clave.charAt(19), no55 = clave.charAt(11), no56 = clave.charAt(3);
    /*char no57=clave.charAt(56),no58=clave.charAt(57),no59=clave.charAt(58),no60=clave.charAt(59),no61=clave.charAt(60);
    char no62=clave.charAt(61),no63=clave.charAt(62),no64=clave.charAt(63);*/
    char permutadoUno[] = new char[56];
    String k1 = "", k2 = "", k3 = "", k4 = "", k5 = "", k6 = "", k7 = "", k8 = "", k9 = "", k10 = "", k11 = "", k12 = "", k13 = "", k14 = "", k15 = "", k16 = "";

    public String[] dividirYObtenerC0D0() {
        permutadoUno[0] = no1;
        permutadoUno[19] = no20;
        permutadoUno[38] = no39;
        permutadoUno[1] = no2;
        permutadoUno[20] = no21;
        permutadoUno[39] = no40;
        permutadoUno[2] = no3;
        permutadoUno[21] = no22;
        permutadoUno[40] = no41;
        permutadoUno[3] = no4;
        permutadoUno[22] = no23;
        permutadoUno[41] = no42;
        permutadoUno[4] = no5;
        permutadoUno[23] = no24;
        permutadoUno[42] = no43;
        permutadoUno[5] = no6;
        permutadoUno[24] = no25;
        permutadoUno[43] = no44;
        permutadoUno[6] = no7;
        permutadoUno[25] = no26;
        permutadoUno[44] = no45;
        permutadoUno[7] = no8;
        permutadoUno[26] = no27;
        permutadoUno[45] = no46;
        permutadoUno[8] = no9;
        permutadoUno[27] = no28;
        permutadoUno[46] = no47;
        permutadoUno[9] = no10;
        permutadoUno[28] = no29;
        permutadoUno[47] = no48;
        permutadoUno[10] = no11;
        permutadoUno[29] = no30;
        permutadoUno[48] = no49;
        permutadoUno[11] = no12;
        permutadoUno[30] = no31;
        permutadoUno[49] = no50;
        permutadoUno[12] = no13;
        permutadoUno[31] = no32;
        permutadoUno[50] = no51;
        permutadoUno[13] = no14;
        permutadoUno[32] = no33;
        permutadoUno[51] = no52;
        permutadoUno[14] = no15;
        permutadoUno[33] = no34;
        permutadoUno[52] = no53;
        permutadoUno[15] = no16;
        permutadoUno[34] = no35;
        permutadoUno[53] = no54;
        permutadoUno[16] = no17;
        permutadoUno[35] = no36;
        permutadoUno[54] = no55;
        permutadoUno[17] = no18;
        permutadoUno[36] = no37;
        permutadoUno[55] = no56;
        permutadoUno[18] = no19;
        permutadoUno[37] = no38;
        String c0 = "";
        String d0 = "";
        for (int i = 0; i < 28; i++) {
            c0 = c0 + permutadoUno[i];
        }
        for (int i = 28; i < 56; i++) {
            d0 = d0 + permutadoUno[i];
        }
        String D1 = "", D2 = "", D3 = "", D4 = "", D5 = "", D6 = "", D7 = "", D8 = "", D9 = "", D10 = "", D11 = "", D12 = "", D13 = "", D14 = "", D15 = "", D16 = "";
        String C1 = "", C2 = "", C3 = "", C4 = "", C5 = "", C6 = "", C7 = "", C8 = "", C9 = "", C10 = "", C11 = "", C12 = "", C13 = "", C14 = "", C15 = "", C16 = "";
        String opc = "";
        char[] cs;
        String entrada = c0;
        String lleno = "";
        for (int j = 0; j < c0.length(); j++) {
            if (j == 0) {
                cs = entrada.toCharArray();
            } else {
                cs = lleno.toCharArray();
            }
            opc = "";
            for (int i = 0; i < entrada.length() - 1; i++) {

                opc = opc + cs[i + 1];
                lleno = opc + cs[0];
            }
            if (j == 0) {
                C1 = lleno;
            } else if (j == 1) {
                C2 = lleno;
            } else if (j == 3) {
                C3 = lleno;
            } else if (j == 5) {
                C4 = lleno;
            } else if (j == 7) {
                C5 = lleno;
            } else if (j == 9) {
                C6 = lleno;
            } else if (j == 11) {
                C7 = lleno;
            } else if (j == 13) {
                C8 = lleno;
            } else if (j == 14) {
                C9 = lleno;
            } else if (j == 16) {
                C10 = lleno;
            } else if (j == 18) {
                C11 = lleno;
            } else if (j == 20) {
                C12 = lleno;
            } else if (j == 22) {
                C13 = lleno;
            } else if (j == 24) {
                C14 = lleno;
            } else if (j == 26) {
                C15 = lleno;
            } else if (j == 27) {
                C16 = lleno;
            }
        }
        //Para D0
        for (int j = 0; j < c0.length(); j++) {
            if (j == 0) {
                cs = d0.toCharArray();
            } else {
                cs = lleno.toCharArray();
            }
            opc = "";
            for (int i = 0; i < entrada.length() - 1; i++) {

                opc = opc + cs[i + 1];
                lleno = opc + cs[0];
            }
            if (j == 0) {
                D1 = lleno;
            } else if (j == 1) {
                D2 = lleno;
            } else if (j == 3) {
                D3 = lleno;
            } else if (j == 5) {
                D4 = lleno;
            } else if (j == 7) {
                D5 = lleno;
            } else if (j == 9) {
                D6 = lleno;
            } else if (j == 11) {
                D7 = lleno;
            } else if (j == 13) {
                D8 = lleno;
            } else if (j == 14) {
                D9 = lleno;
            } else if (j == 16) {
                D10 = lleno;
            } else if (j == 18) {
                D11 = lleno;
            } else if (j == 20) {
                D12 = lleno;
            } else if (j == 22) {
                D13 = lleno;
            } else if (j == 24) {
                D14 = lleno;
            } else if (j == 26) {
                D15 = lleno;
            } else if (j == 27) {
                D16 = lleno;
            }
        }
        String subclave1 = C1 + D1;
        String subclave2 = C2 + D2;
        String subclave3 = C3 + D3;
        String subclave4 = C4 + D4;
        String subclave5 = C5 + D5;
        String subclave6 = C6 + D6;
        String subclave7 = C7 + D7;
        String subclave8 = C8 + D8;
        String subclave9 = C9 + D9;
        String subclave10 = C10 + D10;
        String subclave11 = C11 + D11;
        String subclave12 = C12 + D12;
        String subclave13 = C13 + D13;
        String subclave14 = C14 + D14;
        String subclave15 = C15 + D15;
        String subclave16 = C16 + D16;

        k1 = ""
                + subclave1.charAt(13) + subclave1.charAt(16) + subclave1.charAt(10) + subclave1.charAt(23) + subclave1.charAt(0) + subclave1.charAt(4) + subclave1.charAt(2) + subclave1.charAt(27)
                + subclave1.charAt(14) + subclave1.charAt(5) + subclave1.charAt(20) + subclave1.charAt(9) + subclave1.charAt(22) + subclave1.charAt(18) + subclave1.charAt(11) + subclave1.charAt(3)
                + subclave1.charAt(25) + subclave1.charAt(7) + subclave1.charAt(15) + subclave1.charAt(6) + subclave1.charAt(26) + subclave1.charAt(19) + subclave1.charAt(12) + subclave1.charAt(1)
                + subclave1.charAt(40) + subclave1.charAt(51) + subclave1.charAt(30) + subclave1.charAt(36) + subclave1.charAt(46) + subclave1.charAt(54) + subclave1.charAt(29) + subclave1.charAt(39)
                + subclave1.charAt(50) + subclave1.charAt(44) + subclave1.charAt(32) + subclave1.charAt(47) + subclave1.charAt(43) + subclave1.charAt(48) + subclave1.charAt(38) + subclave1.charAt(55)
                + subclave1.charAt(33) + subclave1.charAt(52) + subclave1.charAt(45) + subclave1.charAt(41) + subclave1.charAt(49) + subclave1.charAt(35) + subclave1.charAt(28) + subclave1.charAt(31);
        k2 = ""
                + subclave2.charAt(13) + subclave2.charAt(16) + subclave2.charAt(10) + subclave2.charAt(23) + subclave2.charAt(0) + subclave2.charAt(4) + subclave2.charAt(2) + subclave2.charAt(27)
                + subclave2.charAt(14) + subclave2.charAt(5) + subclave2.charAt(20) + subclave2.charAt(9) + subclave2.charAt(22) + subclave2.charAt(18) + subclave2.charAt(11) + subclave2.charAt(3)
                + subclave2.charAt(25) + subclave2.charAt(7) + subclave2.charAt(15) + subclave2.charAt(6) + subclave2.charAt(26) + subclave2.charAt(19) + subclave2.charAt(12) + subclave2.charAt(1)
                + subclave2.charAt(40) + subclave2.charAt(51) + subclave2.charAt(30) + subclave2.charAt(36) + subclave2.charAt(46) + subclave2.charAt(54) + subclave2.charAt(29) + subclave2.charAt(39)
                + subclave2.charAt(50) + subclave2.charAt(44) + subclave2.charAt(32) + subclave2.charAt(47) + subclave2.charAt(43) + subclave2.charAt(48) + subclave2.charAt(38) + subclave2.charAt(55)
                + subclave2.charAt(33) + subclave2.charAt(52) + subclave2.charAt(45) + subclave2.charAt(41) + subclave2.charAt(49) + subclave2.charAt(35) + subclave2.charAt(28) + subclave2.charAt(31);
        k3 = ""
                + subclave3.charAt(13) + subclave3.charAt(16) + subclave3.charAt(10) + subclave3.charAt(23) + subclave3.charAt(0) + subclave3.charAt(4) + subclave3.charAt(2) + subclave3.charAt(27)
                + subclave3.charAt(14) + subclave3.charAt(5) + subclave3.charAt(20) + subclave3.charAt(9) + subclave3.charAt(22) + subclave3.charAt(18) + subclave3.charAt(11) + subclave3.charAt(3)
                + subclave3.charAt(25) + subclave3.charAt(7) + subclave3.charAt(15) + subclave3.charAt(6) + subclave3.charAt(26) + subclave3.charAt(19) + subclave3.charAt(12) + subclave3.charAt(1)
                + subclave3.charAt(40) + subclave3.charAt(51) + subclave3.charAt(30) + subclave3.charAt(36) + subclave3.charAt(46) + subclave3.charAt(54) + subclave3.charAt(29) + subclave3.charAt(39)
                + subclave3.charAt(50) + subclave3.charAt(44) + subclave3.charAt(32) + subclave3.charAt(47) + subclave3.charAt(43) + subclave3.charAt(48) + subclave3.charAt(38) + subclave3.charAt(55)
                + subclave3.charAt(33) + subclave3.charAt(52) + subclave3.charAt(45) + subclave3.charAt(41) + subclave3.charAt(49) + subclave3.charAt(35) + subclave3.charAt(28) + subclave3.charAt(31);

        k4 = ""
                + subclave4.charAt(13) + subclave4.charAt(16) + subclave4.charAt(10) + subclave4.charAt(23) + subclave4.charAt(0) + subclave4.charAt(4) + subclave4.charAt(2) + subclave4.charAt(27)
                + subclave4.charAt(14) + subclave4.charAt(5) + subclave4.charAt(20) + subclave4.charAt(9) + subclave4.charAt(22) + subclave4.charAt(18) + subclave4.charAt(11) + subclave4.charAt(3)
                + subclave4.charAt(25) + subclave4.charAt(7) + subclave4.charAt(15) + subclave4.charAt(6) + subclave4.charAt(26) + subclave4.charAt(19) + subclave4.charAt(12) + subclave4.charAt(1)
                + subclave4.charAt(40) + subclave4.charAt(51) + subclave4.charAt(30) + subclave4.charAt(36) + subclave4.charAt(46) + subclave4.charAt(54) + subclave4.charAt(29) + subclave4.charAt(39)
                + subclave4.charAt(50) + subclave4.charAt(44) + subclave4.charAt(32) + subclave4.charAt(47) + subclave4.charAt(43) + subclave4.charAt(48) + subclave4.charAt(38) + subclave4.charAt(55)
                + subclave4.charAt(33) + subclave4.charAt(52) + subclave4.charAt(45) + subclave4.charAt(41) + subclave4.charAt(49) + subclave4.charAt(35) + subclave4.charAt(28) + subclave4.charAt(31);

        k5 = ""
                + subclave5.charAt(13) + subclave5.charAt(16) + subclave5.charAt(10) + subclave5.charAt(23) + subclave5.charAt(0) + subclave5.charAt(4) + subclave5.charAt(2) + subclave5.charAt(27)
                + subclave5.charAt(14) + subclave5.charAt(5) + subclave5.charAt(20) + subclave5.charAt(9) + subclave5.charAt(22) + subclave5.charAt(18) + subclave5.charAt(11) + subclave5.charAt(3)
                + subclave5.charAt(25) + subclave5.charAt(7) + subclave5.charAt(15) + subclave5.charAt(6) + subclave5.charAt(26) + subclave5.charAt(19) + subclave5.charAt(12) + subclave5.charAt(1)
                + subclave5.charAt(40) + subclave5.charAt(51) + subclave5.charAt(30) + subclave5.charAt(36) + subclave5.charAt(46) + subclave5.charAt(54) + subclave5.charAt(29) + subclave5.charAt(39)
                + subclave5.charAt(50) + subclave5.charAt(44) + subclave5.charAt(32) + subclave5.charAt(47) + subclave5.charAt(43) + subclave5.charAt(48) + subclave5.charAt(38) + subclave5.charAt(55)
                + subclave5.charAt(33) + subclave5.charAt(52) + subclave5.charAt(45) + subclave5.charAt(41) + subclave5.charAt(49) + subclave5.charAt(35) + subclave5.charAt(28) + subclave5.charAt(31);

        k6 = ""
                + subclave6.charAt(13) + subclave6.charAt(16) + subclave6.charAt(10) + subclave6.charAt(23) + subclave6.charAt(0) + subclave6.charAt(4) + subclave6.charAt(2) + subclave6.charAt(27)
                + subclave6.charAt(14) + subclave6.charAt(5) + subclave6.charAt(20) + subclave6.charAt(9) + subclave6.charAt(22) + subclave6.charAt(18) + subclave6.charAt(11) + subclave6.charAt(3)
                + subclave6.charAt(25) + subclave6.charAt(7) + subclave6.charAt(15) + subclave6.charAt(6) + subclave6.charAt(26) + subclave6.charAt(19) + subclave6.charAt(12) + subclave6.charAt(1)
                + subclave6.charAt(40) + subclave6.charAt(51) + subclave6.charAt(30) + subclave6.charAt(36) + subclave6.charAt(46) + subclave6.charAt(54) + subclave6.charAt(29) + subclave6.charAt(39)
                + subclave6.charAt(50) + subclave6.charAt(44) + subclave6.charAt(32) + subclave6.charAt(47) + subclave6.charAt(43) + subclave6.charAt(48) + subclave6.charAt(38) + subclave6.charAt(55)
                + subclave6.charAt(33) + subclave6.charAt(52) + subclave6.charAt(45) + subclave6.charAt(41) + subclave6.charAt(49) + subclave6.charAt(35) + subclave6.charAt(28) + subclave6.charAt(31);
        k7 = ""
                + subclave7.charAt(13) + subclave7.charAt(16) + subclave7.charAt(10) + subclave7.charAt(23) + subclave7.charAt(0) + subclave7.charAt(4) + subclave7.charAt(2) + subclave7.charAt(27)
                + subclave7.charAt(14) + subclave7.charAt(5) + subclave7.charAt(20) + subclave7.charAt(9) + subclave7.charAt(22) + subclave7.charAt(18) + subclave7.charAt(11) + subclave7.charAt(3)
                + subclave7.charAt(25) + subclave7.charAt(7) + subclave7.charAt(15) + subclave7.charAt(6) + subclave7.charAt(26) + subclave7.charAt(19) + subclave7.charAt(12) + subclave7.charAt(1)
                + subclave7.charAt(40) + subclave7.charAt(51) + subclave7.charAt(30) + subclave7.charAt(36) + subclave7.charAt(46) + subclave7.charAt(54) + subclave7.charAt(29) + subclave7.charAt(39)
                + subclave7.charAt(50) + subclave7.charAt(44) + subclave7.charAt(32) + subclave7.charAt(47) + subclave7.charAt(43) + subclave7.charAt(48) + subclave7.charAt(38) + subclave7.charAt(55)
                + subclave7.charAt(33) + subclave7.charAt(52) + subclave7.charAt(45) + subclave7.charAt(41) + subclave7.charAt(49) + subclave7.charAt(35) + subclave7.charAt(28) + subclave7.charAt(31);

        k8 = ""
                + subclave8.charAt(13) + subclave8.charAt(16) + subclave8.charAt(10) + subclave8.charAt(23) + subclave8.charAt(0) + subclave8.charAt(4) + subclave8.charAt(2) + subclave8.charAt(27)
                + subclave8.charAt(14) + subclave8.charAt(5) + subclave8.charAt(20) + subclave8.charAt(9) + subclave8.charAt(22) + subclave8.charAt(18) + subclave8.charAt(11) + subclave8.charAt(3)
                + subclave8.charAt(25) + subclave8.charAt(7) + subclave8.charAt(15) + subclave8.charAt(6) + subclave8.charAt(26) + subclave8.charAt(19) + subclave8.charAt(12) + subclave8.charAt(1)
                + subclave8.charAt(40) + subclave8.charAt(51) + subclave8.charAt(30) + subclave8.charAt(36) + subclave8.charAt(46) + subclave8.charAt(54) + subclave8.charAt(29) + subclave8.charAt(39)
                + subclave8.charAt(50) + subclave8.charAt(44) + subclave8.charAt(32) + subclave8.charAt(47) + subclave8.charAt(43) + subclave8.charAt(48) + subclave8.charAt(38) + subclave8.charAt(55)
                + subclave8.charAt(33) + subclave8.charAt(52) + subclave8.charAt(45) + subclave8.charAt(41) + subclave8.charAt(49) + subclave8.charAt(35) + subclave8.charAt(28) + subclave8.charAt(31);

        k9 = ""
                + subclave9.charAt(13) + subclave9.charAt(16) + subclave9.charAt(10) + subclave9.charAt(23) + subclave9.charAt(0) + subclave9.charAt(4) + subclave9.charAt(2) + subclave9.charAt(27)
                + subclave9.charAt(14) + subclave9.charAt(5) + subclave9.charAt(20) + subclave9.charAt(9) + subclave9.charAt(22) + subclave9.charAt(18) + subclave9.charAt(11) + subclave9.charAt(3)
                + subclave9.charAt(25) + subclave9.charAt(7) + subclave9.charAt(15) + subclave9.charAt(6) + subclave9.charAt(26) + subclave9.charAt(19) + subclave9.charAt(12) + subclave9.charAt(1)
                + subclave9.charAt(40) + subclave9.charAt(51) + subclave9.charAt(30) + subclave9.charAt(36) + subclave9.charAt(46) + subclave9.charAt(54) + subclave9.charAt(29) + subclave9.charAt(39)
                + subclave9.charAt(50) + subclave9.charAt(44) + subclave9.charAt(32) + subclave9.charAt(47) + subclave9.charAt(43) + subclave9.charAt(48) + subclave9.charAt(38) + subclave9.charAt(55)
                + subclave9.charAt(33) + subclave9.charAt(52) + subclave9.charAt(45) + subclave9.charAt(41) + subclave9.charAt(49) + subclave9.charAt(35) + subclave9.charAt(28) + subclave9.charAt(31);

        k10 = ""
                + subclave10.charAt(13) + subclave10.charAt(16) + subclave10.charAt(10) + subclave10.charAt(23) + subclave10.charAt(0) + subclave10.charAt(4) + subclave10.charAt(2) + subclave10.charAt(27)
                + subclave10.charAt(14) + subclave10.charAt(5) + subclave10.charAt(20) + subclave10.charAt(9) + subclave10.charAt(22) + subclave10.charAt(18) + subclave10.charAt(11) + subclave10.charAt(3)
                + subclave10.charAt(25) + subclave10.charAt(7) + subclave10.charAt(15) + subclave10.charAt(6) + subclave10.charAt(26) + subclave10.charAt(19) + subclave10.charAt(12) + subclave10.charAt(1)
                + subclave10.charAt(40) + subclave10.charAt(51) + subclave10.charAt(30) + subclave10.charAt(36) + subclave10.charAt(46) + subclave10.charAt(54) + subclave10.charAt(29) + subclave10.charAt(39)
                + subclave10.charAt(50) + subclave10.charAt(44) + subclave10.charAt(32) + subclave10.charAt(47) + subclave10.charAt(43) + subclave10.charAt(48) + subclave10.charAt(38) + subclave10.charAt(55)
                + subclave10.charAt(33) + subclave10.charAt(52) + subclave10.charAt(45) + subclave10.charAt(41) + subclave10.charAt(49) + subclave10.charAt(35) + subclave10.charAt(28) + subclave10.charAt(31);

        k11 = ""
                + subclave11.charAt(13) + subclave11.charAt(16) + subclave11.charAt(10) + subclave11.charAt(23) + subclave11.charAt(0) + subclave11.charAt(4) + subclave11.charAt(2) + subclave11.charAt(27)
                + subclave11.charAt(14) + subclave11.charAt(5) + subclave11.charAt(20) + subclave11.charAt(9) + subclave11.charAt(22) + subclave11.charAt(18) + subclave11.charAt(11) + subclave11.charAt(3)
                + subclave11.charAt(25) + subclave11.charAt(7) + subclave11.charAt(15) + subclave11.charAt(6) + subclave11.charAt(26) + subclave11.charAt(19) + subclave11.charAt(12) + subclave11.charAt(1)
                + subclave11.charAt(40) + subclave11.charAt(51) + subclave11.charAt(30) + subclave11.charAt(36) + subclave11.charAt(46) + subclave11.charAt(54) + subclave11.charAt(29) + subclave11.charAt(39)
                + subclave11.charAt(50) + subclave11.charAt(44) + subclave11.charAt(32) + subclave11.charAt(47) + subclave11.charAt(43) + subclave11.charAt(48) + subclave11.charAt(38) + subclave11.charAt(55)
                + subclave11.charAt(33) + subclave11.charAt(52) + subclave11.charAt(45) + subclave11.charAt(41) + subclave11.charAt(49) + subclave11.charAt(35) + subclave11.charAt(28) + subclave11.charAt(31);

        k12 = ""
                + subclave12.charAt(13) + subclave12.charAt(16) + subclave12.charAt(10) + subclave12.charAt(23) + subclave12.charAt(0) + subclave12.charAt(4) + subclave12.charAt(2) + subclave12.charAt(27)
                + subclave12.charAt(14) + subclave12.charAt(5) + subclave12.charAt(20) + subclave12.charAt(9) + subclave12.charAt(22) + subclave12.charAt(18) + subclave12.charAt(11) + subclave12.charAt(3)
                + subclave12.charAt(25) + subclave12.charAt(7) + subclave12.charAt(15) + subclave12.charAt(6) + subclave12.charAt(26) + subclave12.charAt(19) + subclave12.charAt(12) + subclave12.charAt(1)
                + subclave12.charAt(40) + subclave12.charAt(51) + subclave12.charAt(30) + subclave12.charAt(36) + subclave12.charAt(46) + subclave12.charAt(54) + subclave12.charAt(29) + subclave12.charAt(39)
                + subclave12.charAt(50) + subclave12.charAt(44) + subclave12.charAt(32) + subclave12.charAt(47) + subclave12.charAt(43) + subclave12.charAt(48) + subclave12.charAt(38) + subclave12.charAt(55)
                + subclave12.charAt(33) + subclave12.charAt(52) + subclave12.charAt(45) + subclave12.charAt(41) + subclave12.charAt(49) + subclave12.charAt(35) + subclave12.charAt(28) + subclave12.charAt(31);

        k13 = ""
                + subclave13.charAt(13) + subclave13.charAt(16) + subclave13.charAt(10) + subclave13.charAt(23) + subclave13.charAt(0) + subclave13.charAt(4) + subclave13.charAt(2) + subclave13.charAt(27)
                + subclave13.charAt(14) + subclave13.charAt(5) + subclave13.charAt(20) + subclave13.charAt(9) + subclave13.charAt(22) + subclave13.charAt(18) + subclave13.charAt(11) + subclave13.charAt(3)
                + subclave13.charAt(25) + subclave13.charAt(7) + subclave13.charAt(15) + subclave13.charAt(6) + subclave13.charAt(26) + subclave13.charAt(19) + subclave13.charAt(12) + subclave13.charAt(1)
                + subclave13.charAt(40) + subclave13.charAt(51) + subclave13.charAt(30) + subclave13.charAt(36) + subclave13.charAt(46) + subclave13.charAt(54) + subclave13.charAt(29) + subclave13.charAt(39)
                + subclave13.charAt(50) + subclave13.charAt(44) + subclave13.charAt(32) + subclave13.charAt(47) + subclave13.charAt(43) + subclave13.charAt(48) + subclave13.charAt(38) + subclave13.charAt(55)
                + subclave13.charAt(33) + subclave13.charAt(52) + subclave13.charAt(45) + subclave13.charAt(41) + subclave13.charAt(49) + subclave13.charAt(35) + subclave13.charAt(28) + subclave13.charAt(31);

        k14 = ""
                + subclave14.charAt(13) + subclave14.charAt(16) + subclave14.charAt(10) + subclave14.charAt(23) + subclave14.charAt(0) + subclave14.charAt(4) + subclave14.charAt(2) + subclave14.charAt(27)
                + subclave14.charAt(14) + subclave14.charAt(5) + subclave14.charAt(20) + subclave14.charAt(9) + subclave14.charAt(22) + subclave14.charAt(18) + subclave14.charAt(11) + subclave14.charAt(3)
                + subclave14.charAt(25) + subclave14.charAt(7) + subclave14.charAt(15) + subclave14.charAt(6) + subclave14.charAt(26) + subclave14.charAt(19) + subclave14.charAt(12) + subclave14.charAt(1)
                + subclave14.charAt(40) + subclave14.charAt(51) + subclave14.charAt(30) + subclave14.charAt(36) + subclave14.charAt(46) + subclave14.charAt(54) + subclave14.charAt(29) + subclave14.charAt(39)
                + subclave14.charAt(50) + subclave14.charAt(44) + subclave14.charAt(32) + subclave14.charAt(47) + subclave14.charAt(43) + subclave14.charAt(48) + subclave14.charAt(38) + subclave14.charAt(55)
                + subclave14.charAt(33) + subclave14.charAt(52) + subclave14.charAt(45) + subclave14.charAt(41) + subclave14.charAt(49) + subclave14.charAt(35) + subclave14.charAt(28) + subclave14.charAt(31);

        k15 = ""
                + subclave15.charAt(13) + subclave15.charAt(16) + subclave15.charAt(10) + subclave15.charAt(23) + subclave15.charAt(0) + subclave15.charAt(4) + subclave15.charAt(2) + subclave15.charAt(27)
                + subclave15.charAt(14) + subclave15.charAt(5) + subclave15.charAt(20) + subclave15.charAt(9) + subclave15.charAt(22) + subclave15.charAt(18) + subclave15.charAt(11) + subclave15.charAt(3)
                + subclave15.charAt(25) + subclave15.charAt(7) + subclave15.charAt(15) + subclave15.charAt(6) + subclave15.charAt(26) + subclave15.charAt(19) + subclave15.charAt(12) + subclave15.charAt(1)
                + subclave15.charAt(40) + subclave15.charAt(51) + subclave15.charAt(30) + subclave15.charAt(36) + subclave15.charAt(46) + subclave15.charAt(54) + subclave15.charAt(29) + subclave15.charAt(39)
                + subclave15.charAt(50) + subclave15.charAt(44) + subclave15.charAt(32) + subclave15.charAt(47) + subclave15.charAt(43) + subclave15.charAt(48) + subclave15.charAt(38) + subclave15.charAt(55)
                + subclave15.charAt(33) + subclave15.charAt(52) + subclave15.charAt(45) + subclave15.charAt(41) + subclave15.charAt(49) + subclave15.charAt(35) + subclave15.charAt(28) + subclave15.charAt(31);

        k16 = ""
                + subclave16.charAt(13) + subclave16.charAt(16) + subclave16.charAt(10) + subclave16.charAt(23) + subclave16.charAt(0) + subclave16.charAt(4) + subclave16.charAt(2) + subclave16.charAt(27)
                + subclave16.charAt(14) + subclave16.charAt(5) + subclave16.charAt(20) + subclave16.charAt(9) + subclave16.charAt(22) + subclave16.charAt(18) + subclave16.charAt(11) + subclave16.charAt(3)
                + subclave16.charAt(25) + subclave16.charAt(7) + subclave16.charAt(15) + subclave16.charAt(6) + subclave16.charAt(26) + subclave16.charAt(19) + subclave16.charAt(12) + subclave16.charAt(1)
                + subclave16.charAt(40) + subclave16.charAt(51) + subclave16.charAt(30) + subclave16.charAt(36) + subclave16.charAt(46) + subclave16.charAt(54) + subclave16.charAt(29) + subclave16.charAt(39)
                + subclave16.charAt(50) + subclave16.charAt(44) + subclave16.charAt(32) + subclave16.charAt(47) + subclave16.charAt(43) + subclave16.charAt(48) + subclave16.charAt(38) + subclave16.charAt(55)
                + subclave16.charAt(33) + subclave16.charAt(52) + subclave16.charAt(45) + subclave16.charAt(41) + subclave16.charAt(49) + subclave16.charAt(35) + subclave16.charAt(28) + subclave16.charAt(31);

        String[] claves = {k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16};
        return claves;
    }
}