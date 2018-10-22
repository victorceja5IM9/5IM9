/**
 *
 * @author Vicas Ceja
 */
import java.util.*;

public class LlavesDes {

    Scanner vicas = new Scanner(System.in);
    String clave = "0001001100110100010101110111100110011011101111001101111111110001";
    char no1 = clave.charAt(56), no2 = clave.charAt(48), no3 = clave.charAt(40), no4 = clave.charAt(32), no5 = clave.charAt(24), no6 = clave.charAt(16), no7 = clave.charAt(8), no8 = clave.charAt(0),
     no9 = clave.charAt(57), no10 = clave.charAt(49), no11 = clave.charAt(41), no12 = clave.charAt(33), no13 = clave.charAt(25), no14 = clave.charAt(17), no15 = clave.charAt(9), no16 = clave.charAt(1),
     no17 = clave.charAt(58), no18 = clave.charAt(50), no19 = clave.charAt(42), no20 = clave.charAt(34), no21 = clave.charAt(26), no22 = clave.charAt(18), no23 = clave.charAt(10),
     no24 = clave.charAt(2), no25 = clave.charAt(59), no26 = clave.charAt(51), no27 = clave.charAt(43), no28 = clave.charAt(35), no29 = clave.charAt(62),
     no30 = clave.charAt(54), no31 = clave.charAt(46), no32 = clave.charAt(38), no33 = clave.charAt(30),
     no34 = clave.charAt(22), no35 = clave.charAt(14), no36 = clave.charAt(6), no37 = clave.charAt(61), no38 = clave.charAt(53), no39 = clave.charAt(45),
     no40 = clave.charAt(37), no41 = clave.charAt(29), no42 = clave.charAt(21), no43 = clave.charAt(13), no44 = clave.charAt(5), no45 = clave.charAt(60),
     no46 = clave.charAt(52), no47 = clave.charAt(44), no48 = clave.charAt(36), no49 = clave.charAt(28), no50 = clave.charAt(20), no51 = clave.charAt(12),
     no52 = clave.charAt(4), no53 = clave.charAt(27), no54 = clave.charAt(19), no55 = clave.charAt(11), no56 = clave.charAt(3),
     permutado[] = new char[56];
    String k1 = "", k2 = "", k3 = "", k4 = "", k5 = "", k6 = "", k7 = "", k8 = "", k9 = "", k10 = "", k11 = "", k12 = "", k13 = "", k14 = "", k15 = "", k16 = "";

    public String[] dividirYObtenerC0D0() {
        permutado[0] = no1;
        permutado[19] = no20;
        permutado[38] = no39;
        permutado[1] = no2;
        permutado[20] = no21;
        permutado[39] = no40;
        permutado[2] = no3;
        permutado[21] = no22;
        permutado[40] = no41;
        permutado[3] = no4;
        permutado[22] = no23;
        permutado[41] = no42;
        permutado[4] = no5;
        permutado[23] = no24;
        permutado[42] = no43;
        permutado[5] = no6;
        permutado[24] = no25;
        permutado[43] = no44;
        permutado[6] = no7;
        permutado[25] = no26;
        permutado[44] = no45;
        permutado[7] = no8;
        permutado[26] = no27;
        permutado[45] = no46;
        permutado[8] = no9;
        permutado[27] = no28;
        permutado[46] = no47;
        permutado[9] = no10;
        permutado[28] = no29;
        permutado[47] = no48;
        permutado[10] = no11;
        permutado[29] = no30;
        permutado[48] = no49;
        permutado[11] = no12;
        permutado[30] = no31;
        permutado[49] = no50;
        permutado[12] = no13;
        permutado[31] = no32;
        permutado[50] = no51;
        permutado[13] = no14;
        permutado[32] = no33;
        permutado[51] = no52;
        permutado[14] = no15;
        permutado[33] = no34;
        permutado[52] = no53;
        permutado[15] = no16;
        permutado[34] = no35;
        permutado[53] = no54;
        permutado[16] = no17;
        permutado[35] = no36;
        permutado[54] = no55;
        permutado[17] = no18;
        permutado[36] = no37;
        permutado[55] = no56;
        permutado[18] = no19;
        permutado[37] = no38;
        String c0 = "";
        String d0 = "";
        for (int i = 0; i < 28; i++) {
            c0 = c0 + permutado[i];
        }
        for (int i = 28; i < 56; i++) {
            d0 = d0 + permutado[i];
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
            } else 
				if (j == 1) {
                C2 = lleno;
            } else 
				if (j == 3) {
                C3 = lleno;
            } else 
				if (j == 5) {
                C4 = lleno;
            } else 
				if (j == 7) {
                C5 = lleno;
            } else 
				if (j == 9) {
                C6 = lleno;
            } else 
				if (j == 11) {
                C7 = lleno;
            } else 
				if (j == 13) {
                C8 = lleno;
            } else 
				if (j == 14) {
                C9 = lleno;
            } else 
				if (j == 16) {
                C10 = lleno;
            } else 
				if (j == 18) {
                C11 = lleno;
            } else 
				if (j == 20) {
                C12 = lleno;
            } else 
				if (j == 22) {
                C13 = lleno;
            } else 
				if (j == 24) {
                C14 = lleno;
            } else 
				if (j == 26) {
                C15 = lleno;
            } else 
				if (j == 27) {
                C16 = lleno;
            }
        }
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
            } else 
				if (j == 1) {
                D2 = lleno;
            } else 
				if (j == 3) {
                D3 = lleno;
            } else 
				if (j == 5) {
                D4 = lleno;
            } else 
				if (j == 7) {
                D5 = lleno;
            } else 
				if (j == 9) {
                D6 = lleno;
            } else 
				if (j == 11) {
                D7 = lleno;
            } else 
				if (j == 13) {
                D8 = lleno;
            } else 
				if (j == 14) {
                D9 = lleno;
            } else 
				if (j == 16) {
                D10 = lleno;
            } else 
				if (j == 18) {
                D11 = lleno;
            } else 
				if (j == 20) {
                D12 = lleno;
            } else 
				if (j == 22) {
                D13 = lleno;
            } else 
				if (j == 24) {
                D14 = lleno;
            } else 
				if (j == 26) {
                D15 = lleno;
            } else 
				if (j == 27) {
                D16 = lleno;
            }
        }
        String key1 = C1 + D1;
        String key2 = C2 + D2;
        String key3 = C3 + D3;
        String key4 = C4 + D4;
        String key5 = C5 + D5;
        String key6 = C6 + D6;
        String key7 = C7 + D7;
        String key8 = C8 + D8;
        String key9 = C9 + D9;
        String key10 = C10 + D10;
        String key11 = C11 + D11;
        String key12 = C12 + D12;
        String key13 = C13 + D13;
        String key14 = C14 + D14;
        String key15 = C15 + D15;
        String key16 = C16 + D16;

        k1 = ""+ key1.charAt(13) + key1.charAt(16) + key1.charAt(10) + key1.charAt(23) + key1.charAt(0) + key1.charAt(4) + key1.charAt(2) + key1.charAt(27)
                + key1.charAt(14) + key1.charAt(5) + key1.charAt(20) + key1.charAt(9) + key1.charAt(22) + key1.charAt(18) + key1.charAt(11) + key1.charAt(3)
                + key1.charAt(25) + key1.charAt(7) + key1.charAt(15) + key1.charAt(6) + key1.charAt(26) + key1.charAt(19) + key1.charAt(12) + key1.charAt(1)
                + key1.charAt(40) + key1.charAt(51) + key1.charAt(30) + key1.charAt(36) + key1.charAt(46) + key1.charAt(54) + key1.charAt(29) + key1.charAt(39)
                + key1.charAt(50) + key1.charAt(44) + key1.charAt(32) + key1.charAt(47) + key1.charAt(43) + key1.charAt(48) + key1.charAt(38) + key1.charAt(55)
                + key1.charAt(33) + key1.charAt(52) + key1.charAt(45) + key1.charAt(41) + key1.charAt(49) + key1.charAt(35) + key1.charAt(28) + key1.charAt(31);
                
        k2 = ""+ key2.charAt(13) + key2.charAt(16) + key2.charAt(10) + key2.charAt(23) + key2.charAt(0) + key2.charAt(4) + key2.charAt(2) + key2.charAt(27)
                + key2.charAt(14) + key2.charAt(5) + key2.charAt(20) + key2.charAt(9) + key2.charAt(22) + key2.charAt(18) + key2.charAt(11) + key2.charAt(3)
                + key2.charAt(25) + key2.charAt(7) + key2.charAt(15) + key2.charAt(6) + key2.charAt(26) + key2.charAt(19) + key2.charAt(12) + key2.charAt(1)
                + key2.charAt(40) + key2.charAt(51) + key2.charAt(30) + key2.charAt(36) + key2.charAt(46) + key2.charAt(54) + key2.charAt(29) + key2.charAt(39)
                + key2.charAt(50) + key2.charAt(44) + key2.charAt(32) + key2.charAt(47) + key2.charAt(43) + key2.charAt(48) + key2.charAt(38) + key2.charAt(55)
                + key2.charAt(33) + key2.charAt(52) + key2.charAt(45) + key2.charAt(41) + key2.charAt(49) + key2.charAt(35) + key2.charAt(28) + key2.charAt(31);
                
        k3 = ""+ key3.charAt(13) + key3.charAt(16) + key3.charAt(10) + key3.charAt(23) + key3.charAt(0) + key3.charAt(4) + key3.charAt(2) + key3.charAt(27)
                + key3.charAt(14) + key3.charAt(5) + key3.charAt(20) + key3.charAt(9) + key3.charAt(22) + key3.charAt(18) + key3.charAt(11) + key3.charAt(3)
                + key3.charAt(25) + key3.charAt(7) + key3.charAt(15) + key3.charAt(6) + key3.charAt(26) + key3.charAt(19) + key3.charAt(12) + key3.charAt(1)
                + key3.charAt(40) + key3.charAt(51) + key3.charAt(30) + key3.charAt(36) + key3.charAt(46) + key3.charAt(54) + key3.charAt(29) + key3.charAt(39)
                + key3.charAt(50) + key3.charAt(44) + key3.charAt(32) + key3.charAt(47) + key3.charAt(43) + key3.charAt(48) + key3.charAt(38) + key3.charAt(55)
                + key3.charAt(33) + key3.charAt(52) + key3.charAt(45) + key3.charAt(41) + key3.charAt(49) + key3.charAt(35) + key3.charAt(28) + key3.charAt(31);
                

        k4 = "" + key4.charAt(13) + key4.charAt(16) + key4.charAt(10) + key4.charAt(23) + key4.charAt(0) + key4.charAt(4) + key4.charAt(2) + key4.charAt(27)
                + key4.charAt(14) + key4.charAt(5) + key4.charAt(20) + key4.charAt(9) + key4.charAt(22) + key4.charAt(18) + key4.charAt(11) + key4.charAt(3)
                + key4.charAt(25) + key4.charAt(7) + key4.charAt(15) + key4.charAt(6) + key4.charAt(26) + key4.charAt(19) + key4.charAt(12) + key4.charAt(1)
                + key4.charAt(40) + key4.charAt(51) + key4.charAt(30) + key4.charAt(36) + key4.charAt(46) + key4.charAt(54) + key4.charAt(29) + key4.charAt(39)
                + key4.charAt(50) + key4.charAt(44) + key4.charAt(32) + key4.charAt(47) + key4.charAt(43) + key4.charAt(48) + key4.charAt(38) + key4.charAt(55)
                + key4.charAt(33) + key4.charAt(52) + key4.charAt(45) + key4.charAt(41) + key4.charAt(49) + key4.charAt(35) + key4.charAt(28) + key4.charAt(31);
               

        k5 = "" + key5.charAt(13) + key5.charAt(16) + key5.charAt(10) + key5.charAt(23) + key5.charAt(0) + key5.charAt(4) + key5.charAt(2) + key5.charAt(27)
                + key5.charAt(14) + key5.charAt(5) + key5.charAt(20) + key5.charAt(9) + key5.charAt(22) + key5.charAt(18) + key5.charAt(11) + key5.charAt(3)
                + key5.charAt(25) + key5.charAt(7) + key5.charAt(15) + key5.charAt(6) + key5.charAt(26) + key5.charAt(19) + key5.charAt(12) + key5.charAt(1)
                + key5.charAt(40) + key5.charAt(51) + key5.charAt(30) + key5.charAt(36) + key5.charAt(46) + key5.charAt(54) + key5.charAt(29) + key5.charAt(39)
                + key5.charAt(50) + key5.charAt(44) + key5.charAt(32) + key5.charAt(47) + key5.charAt(43) + key5.charAt(48) + key5.charAt(38) + key5.charAt(55)
                + key5.charAt(33) + key5.charAt(52) + key5.charAt(45) + key5.charAt(41) + key5.charAt(49) + key5.charAt(35) + key5.charAt(28) + key5.charAt(31);
               

        k6 = ""+ key6.charAt(13) + key6.charAt(16) + key6.charAt(10) + key6.charAt(23) + key6.charAt(0) + key6.charAt(4) + key6.charAt(2) + key6.charAt(27)
                + key6.charAt(14) + key6.charAt(5) + key6.charAt(20) + key6.charAt(9) + key6.charAt(22) + key6.charAt(18) + key6.charAt(11) + key6.charAt(3)
                + key6.charAt(25) + key6.charAt(7) + key6.charAt(15) + key6.charAt(6) + key6.charAt(26) + key6.charAt(19) + key6.charAt(12) + key6.charAt(1)
                + key6.charAt(40) + key6.charAt(51) + key6.charAt(30) + key6.charAt(36) + key6.charAt(46) + key6.charAt(54) + key6.charAt(29) + key6.charAt(39)
                + key6.charAt(50) + key6.charAt(44) + key6.charAt(32) + key6.charAt(47) + key6.charAt(43) + key6.charAt(48) + key6.charAt(38) + key6.charAt(55)
                + key6.charAt(33) + key6.charAt(52) + key6.charAt(45) + key6.charAt(41) + key6.charAt(49) + key6.charAt(35) + key6.charAt(28) + key6.charAt(31);
                
        k7 = ""+ key7.charAt(13) + key7.charAt(16) + key7.charAt(10) + key7.charAt(23) + key7.charAt(0) + key7.charAt(4) + key7.charAt(2) + key7.charAt(27)
                + key7.charAt(14) + key7.charAt(5) + key7.charAt(20) + key7.charAt(9) + key7.charAt(22) + key7.charAt(18) + key7.charAt(11) + key7.charAt(3)
                + key7.charAt(25) + key7.charAt(7) + key7.charAt(15) + key7.charAt(6) + key7.charAt(26) + key7.charAt(19) + key7.charAt(12) + key7.charAt(1)
                + key7.charAt(40) + key7.charAt(51) + key7.charAt(30) + key7.charAt(36) + key7.charAt(46) + key7.charAt(54) + key7.charAt(29) + key7.charAt(39)
                + key7.charAt(50) + key7.charAt(44) + key7.charAt(32) + key7.charAt(47) + key7.charAt(43) + key7.charAt(48) + key7.charAt(38) + key7.charAt(55)
                + key7.charAt(33) + key7.charAt(52) + key7.charAt(45) + key7.charAt(41) + key7.charAt(49) + key7.charAt(35) + key7.charAt(28) + key7.charAt(31);
                

        k8 = "" + key8.charAt(13) + key8.charAt(16) + key8.charAt(10) + key8.charAt(23) + key8.charAt(0) + key8.charAt(4) + key8.charAt(2) + key8.charAt(27)
                + key8.charAt(14) + key8.charAt(5) + key8.charAt(20) + key8.charAt(9) + key8.charAt(22) + key8.charAt(18) + key8.charAt(11) + key8.charAt(3)
                + key8.charAt(25) + key8.charAt(7) + key8.charAt(15) + key8.charAt(6) + key8.charAt(26) + key8.charAt(19) + key8.charAt(12) + key8.charAt(1)
                + key8.charAt(40) + key8.charAt(51) + key8.charAt(30) + key8.charAt(36) + key8.charAt(46) + key8.charAt(54) + key8.charAt(29) + key8.charAt(39)
                + key8.charAt(50) + key8.charAt(44) + key8.charAt(32) + key8.charAt(47) + key8.charAt(43) + key8.charAt(48) + key8.charAt(38) + key8.charAt(55)
                + key8.charAt(33) + key8.charAt(52) + key8.charAt(45) + key8.charAt(41) + key8.charAt(49) + key8.charAt(35) + key8.charAt(28) + key8.charAt(31);
               

        k9 = "" + key9.charAt(13) + key9.charAt(16) + key9.charAt(10) + key9.charAt(23) + key9.charAt(0) + key9.charAt(4) + key9.charAt(2) + key9.charAt(27)
                + key9.charAt(14) + key9.charAt(5) + key9.charAt(20) + key9.charAt(9) + key9.charAt(22) + key9.charAt(18) + key9.charAt(11) + key9.charAt(3)
                + key9.charAt(25) + key9.charAt(7) + key9.charAt(15) + key9.charAt(6) + key9.charAt(26) + key9.charAt(19) + key9.charAt(12) + key9.charAt(1)
                + key9.charAt(40) + key9.charAt(51) + key9.charAt(30) + key9.charAt(36) + key9.charAt(46) + key9.charAt(54) + key9.charAt(29) + key9.charAt(39)
                + key9.charAt(50) + key9.charAt(44) + key9.charAt(32) + key9.charAt(47) + key9.charAt(43) + key9.charAt(48) + key9.charAt(38) + key9.charAt(55)
                + key9.charAt(33) + key9.charAt(52) + key9.charAt(45) + key9.charAt(41) + key9.charAt(49) + key9.charAt(35) + key9.charAt(28) + key9.charAt(31);
               

        k10 = "" + key10.charAt(13) + key10.charAt(16) + key10.charAt(10) + key10.charAt(23) + key10.charAt(0) + key10.charAt(4) + key10.charAt(2) + key10.charAt(27)
                + key10.charAt(14) + key10.charAt(5) + key10.charAt(20) + key10.charAt(9) + key10.charAt(22) + key10.charAt(18) + key10.charAt(11) + key10.charAt(3)
                + key10.charAt(25) + key10.charAt(7) + key10.charAt(15) + key10.charAt(6) + key10.charAt(26) + key10.charAt(19) + key10.charAt(12) + key10.charAt(1)
                + key10.charAt(40) + key10.charAt(51) + key10.charAt(30) + key10.charAt(36) + key10.charAt(46) + key10.charAt(54) + key10.charAt(29) + key10.charAt(39)
                + key10.charAt(50) + key10.charAt(44) + key10.charAt(32) + key10.charAt(47) + key10.charAt(43) + key10.charAt(48) + key10.charAt(38) + key10.charAt(55)
                + key10.charAt(33) + key10.charAt(52) + key10.charAt(45) + key10.charAt(41) + key10.charAt(49) + key10.charAt(35) + key10.charAt(28) + key10.charAt(31);
               

        k11 = ""+ key11.charAt(13) + key11.charAt(16) + key11.charAt(10) + key11.charAt(23) + key11.charAt(0) + key11.charAt(4) + key11.charAt(2) + key11.charAt(27)
                + key11.charAt(14) + key11.charAt(5) + key11.charAt(20) + key11.charAt(9) + key11.charAt(22) + key11.charAt(18) + key11.charAt(11) + key11.charAt(3)
                + key11.charAt(25) + key11.charAt(7) + key11.charAt(15) + key11.charAt(6) + key11.charAt(26) + key11.charAt(19) + key11.charAt(12) + key11.charAt(1)
                + key11.charAt(40) + key11.charAt(51) + key11.charAt(30) + key11.charAt(36) + key11.charAt(46) + key11.charAt(54) + key11.charAt(29) + key11.charAt(39)
                + key11.charAt(50) + key11.charAt(44) + key11.charAt(32) + key11.charAt(47) + key11.charAt(43) + key11.charAt(48) + key11.charAt(38) + key11.charAt(55)
                + key11.charAt(33) + key11.charAt(52) + key11.charAt(45) + key11.charAt(41) + key11.charAt(49) + key11.charAt(35) + key11.charAt(28) + key11.charAt(31);
                

        k12 = ""+ key12.charAt(13) + key12.charAt(16) + key12.charAt(10) + key12.charAt(23) + key12.charAt(0) + key12.charAt(4) + key12.charAt(2) + key12.charAt(27)
                + key12.charAt(14) + key12.charAt(5) + key12.charAt(20) + key12.charAt(9) + key12.charAt(22) + key12.charAt(18) + key12.charAt(11) + key12.charAt(3)
                + key12.charAt(25) + key12.charAt(7) + key12.charAt(15) + key12.charAt(6) + key12.charAt(26) + key12.charAt(19) + key12.charAt(12) + key12.charAt(1)
                + key12.charAt(40) + key12.charAt(51) + key12.charAt(30) + key12.charAt(36) + key12.charAt(46) + key12.charAt(54) + key12.charAt(29) + key12.charAt(39)
                + key12.charAt(50) + key12.charAt(44) + key12.charAt(32) + key12.charAt(47) + key12.charAt(43) + key12.charAt(48) + key12.charAt(38) + key12.charAt(55)
                + key12.charAt(33) + key12.charAt(52) + key12.charAt(45) + key12.charAt(41) + key12.charAt(49) + key12.charAt(35) + key12.charAt(28) + key12.charAt(31);
                

        k13 = ""+ key13.charAt(13) + key13.charAt(16) + key13.charAt(10) + key13.charAt(23) + key13.charAt(0) + key13.charAt(4) + key13.charAt(2) + key13.charAt(27)
                + key13.charAt(14) + key13.charAt(5) + key13.charAt(20) + key13.charAt(9) + key13.charAt(22) + key13.charAt(18) + key13.charAt(11) + key13.charAt(3)
                + key13.charAt(25) + key13.charAt(7) + key13.charAt(15) + key13.charAt(6) + key13.charAt(26) + key13.charAt(19) + key13.charAt(12) + key13.charAt(1)
                + key13.charAt(40) + key13.charAt(51) + key13.charAt(30) + key13.charAt(36) + key13.charAt(46) + key13.charAt(54) + key13.charAt(29) + key13.charAt(39)
                + key13.charAt(50) + key13.charAt(44) + key13.charAt(32) + key13.charAt(47) + key13.charAt(43) + key13.charAt(48) + key13.charAt(38) + key13.charAt(55)
                + key13.charAt(33) + key13.charAt(52) + key13.charAt(45) + key13.charAt(41) + key13.charAt(49) + key13.charAt(35) + key13.charAt(28) + key13.charAt(31);
                

        k14 = "" + key14.charAt(13) + key14.charAt(16) + key14.charAt(10) + key14.charAt(23) + key14.charAt(0) + key14.charAt(4) + key14.charAt(2) + key14.charAt(27)
                + key14.charAt(14) + key14.charAt(5) + key14.charAt(20) + key14.charAt(9) + key14.charAt(22) + key14.charAt(18) + key14.charAt(11) + key14.charAt(3)
                + key14.charAt(25) + key14.charAt(7) + key14.charAt(15) + key14.charAt(6) + key14.charAt(26) + key14.charAt(19) + key14.charAt(12) + key14.charAt(1)
                + key14.charAt(40) + key14.charAt(51) + key14.charAt(30) + key14.charAt(36) + key14.charAt(46) + key14.charAt(54) + key14.charAt(29) + key14.charAt(39)
                + key14.charAt(50) + key14.charAt(44) + key14.charAt(32) + key14.charAt(47) + key14.charAt(43) + key14.charAt(48) + key14.charAt(38) + key14.charAt(55)
                + key14.charAt(33) + key14.charAt(52) + key14.charAt(45) + key14.charAt(41) + key14.charAt(49) + key14.charAt(35) + key14.charAt(28) + key14.charAt(31);
               

        k15 = ""+ key15.charAt(13) + key15.charAt(16) + key15.charAt(10) + key15.charAt(23) + key15.charAt(0) + key15.charAt(4) + key15.charAt(2) + key15.charAt(27)
                + key15.charAt(14) + key15.charAt(5) + key15.charAt(20) + key15.charAt(9) + key15.charAt(22) + key15.charAt(18) + key15.charAt(11) + key15.charAt(3)
                + key15.charAt(25) + key15.charAt(7) + key15.charAt(15) + key15.charAt(6) + key15.charAt(26) + key15.charAt(19) + key15.charAt(12) + key15.charAt(1)
                + key15.charAt(40) + key15.charAt(51) + key15.charAt(30) + key15.charAt(36) + key15.charAt(46) + key15.charAt(54) + key15.charAt(29) + key15.charAt(39)
                + key15.charAt(50) + key15.charAt(44) + key15.charAt(32) + key15.charAt(47) + key15.charAt(43) + key15.charAt(48) + key15.charAt(38) + key15.charAt(55)
                + key15.charAt(33) + key15.charAt(52) + key15.charAt(45) + key15.charAt(41) + key15.charAt(49) + key15.charAt(35) + key15.charAt(28) + key15.charAt(31);
                

        k16 = "" + key16.charAt(13) + key16.charAt(16) + key16.charAt(10) + key16.charAt(23) + key16.charAt(0) + key16.charAt(4) + key16.charAt(2) + key16.charAt(27)
                + key16.charAt(14) + key16.charAt(5) + key16.charAt(20) + key16.charAt(9) + key16.charAt(22) + key16.charAt(18) + key16.charAt(11) + key16.charAt(3)
                + key16.charAt(25) + key16.charAt(7) + key16.charAt(15) + key16.charAt(6) + key16.charAt(26) + key16.charAt(19) + key16.charAt(12) + key16.charAt(1)
                + key16.charAt(40) + key16.charAt(51) + key16.charAt(30) + key16.charAt(36) + key16.charAt(46) + key16.charAt(54) + key16.charAt(29) + key16.charAt(39)
                + key16.charAt(50) + key16.charAt(44) + key16.charAt(32) + key16.charAt(47) + key16.charAt(43) + key16.charAt(48) + key16.charAt(38) + key16.charAt(55)
                + key16.charAt(33) + key16.charAt(52) + key16.charAt(45) + key16.charAt(41) + key16.charAt(49) + key16.charAt(35) + key16.charAt(28) + key16.charAt(31);
               

        String[] claves = {k1	, k2	, k3	, k4	, k5	, k6	, k7	, k8	, k9	, k10	, k11	, k12	, k13	, k14	, k15	, k16	};
        return claves;
    }
}