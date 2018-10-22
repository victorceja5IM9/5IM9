/**
 *
 * @author Vicas Ceja
 */
public class Sustituciones {

    public String S1(String clav) {
        String S1[][] = {{"1110", "0100", "1101", "0001", "0010", "1111", "1011", "1000", "0011", "1010", "0110", "1100", "0101", "1001", "0000", "0111"},
        {"0000", "1111", "0111", "0100", "1110", "0010", "1101", "0001", "1010", "0110", "1100", "1011", "1001", "0101", "0011", "1000"},
        {"0100", "0001", "1110", "1000", "1101", "0110", "0010", "1011", "1111", "1100", "1001", "0111", "0011", "1010", "0101", "0000"},
        {"1111", "1100", "1000", "0010", "0100", "1001", "0001", "0111", "0101", "1011", "0011", "1110", "1010", "0000", "0110", "1101"}};
        String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S2(String clav) {
        String S1[][] = {{"1111", "0001", "1000", "1110", "0110", "1011", "0011", "0100", "1001", "0111", "0010", "1101", "1100", "0000", "0101", "1010"},
        {"0011", "1101", "0100", "0111", "1111", "0010", "1000", "1110", "1100", "0000", "0001", "1010", "0110", "1001", "1011", "0101"},
        {"0000", "1110", "0111", "1011", "1010", "0100", "1101", "0001", "0101", "1000", "1100", "0110", "1001", "0011", "0010", "1111"},
        {"1101", "1000", "1010", "0001", "0011", "1111", "0100", "0010", "1011", "0110", "0111", "1100", "0000", "0101", "1110", "1001"}};
		
        String inicial = "", medio = "", finall = "";
		
        inicial = "" + clav.charAt(0) + clav.charAt(5);
		
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
		
        int fila = 0, columna=0;
        
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S3(String clav) {
        String S1[][] = {{"1010", "0000", "1001", "1110", "0110", "0011", "1111", "0101", "0001", "1101", "1100", "0111", "1011", "0100", "0010", "1000"},
        {"1101", "0111", "0000", "1001", "0011", "0100", "0110", "1010", "0010", "1000", "0101", "1110", "1100", "1011", "1111", "0001"},
        {"1101", "0110", "0100", "1001", "1000", "1111", "0011", "0000", "1011", "0001", "0010", "1100", "0101", "1010", "1110", "0111"},
        {"0001", "1010", "1101", "0000", "0110", "1001", "1000", "0111", "0100", "1111", "1110", "0011", "1011", "0101", "0010", "1100"}};
		
        String inicial = "", medio = "", finall = "";
		
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S4(String clav) {
        String S1[][] = {{"0111", "1101", "1110", "0011", "0000", "0110", "1001", "1010", "0001", "0010", "1000", "0101", "1011", "1100", "0100", "1111"},
        {"1101", "1000", "1011", "0101", "0110", "1111", "0000", "0011", "0100", "0111", "0010", "1100", "0001", "1010", "1110", "1001"},
        {"1010", "0110", "1001", "0000", "1100", "1011", "0111", "1101", "1111", "0001", "0011", "1110", "0101", "0010", "1000", "0100"},
        {"0011", "1111", "0000", "0110", "1010", "0001", "1101", "1000", "1001", "0100", "0101", "1011", "1100", "0111", "0010", "1110"}};
        
		String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S5(String clav) {
        String S1[][] = {{"0010", "1100", "0100", "0001", "0111", "1010", "1011", "0110", "1000", "0101", "0011", "1111", "1101", "0000", "1110", "1001"},
        {"1110", "1011", "0010", "1100", "0100", "0111", "1101", "0001", "0101", "0000", "1111", "1010", "0011", "1001", "1000", "0110"},
        {"0100", "0010", "0001", "1011", "1010", "1101", "0111", "1000", "1111", "1001", "1100", "0101", "0110", "0011", "0000", "1110"},
        {"1011", "1000", "1100", "0111", "0001", "1110", "0010", "1101", "0110", "1111", "0000", "1001", "1010", "0100", "0101", "0011"}};
       
	   String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S6(String clav) {
        
		String S1[][] = {{"1100", "0001", "1010", "1111", "1001", "0010", "0110", "1000", "0000", "1101", "0011", "0100", "1110", "0111", "0101", "1011"},
        {"1010", "1111", "0100", "0010", "0111", "1100", "1001", "0101", "0110", "0001", "1101", "1110", "0000", "1011", "0011", "1000"},
        {"1001", "1110", "1111", "0101", "0010", "1000", "1100", "0011", "0111", "0000", "0100", "1010", "0001", "1101", "1011", "0110"},
        {"0100", "0011", "0010", "1100", "1001", "0101", "1111", "1010", "1011", "1110", "0001", "0111", "0110", "0000", "1000", "1101"}};
        
		String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S7(String clav) {
        
		String S1[][] = {{"0100", "1011", "0010", "1110", "1111", "0000", "1000", "1101", "0011", "1100", "1001", "0111", "0101", "1010", "0110", "0001"},
        {"1101", "0000", "1011", "0111", "0100", "1001", "0001", "1010", "1110", "0011", "0101", "1100", "0010", "1111", "1000", "0110"},
        {"0001", "0100", "1011", "1101", "1100", "0011", "0111", "1110", "1010", "1111", "0110", "1000", "0000", "0101", "1001", "0010"},
        {"0110", "1011", "1101", "1000", "0001", "0100", "1010", "0111", "1001", "0101", "0000", "1111", "1110", "0010", "0011", "1100"}};
        
		String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }

    public String S8(String clav) {
        
		
		String S1[][] = {{"1101", "0010", "1000", "0100", "0110", "1111", "1011", "0001", "1010", "1001", "0011", "1110", "0101", "0000", "1100", "0111"},
        {"0001", "1111", "1101", "1000", "1010", "0011", "0111", "0100", "1100", "0101", "0110", "1011", "0000", "1110", "1001", "0010"},
        {"0111", "1011", "0100", "0001", "1001", "1100", "1110", "0010", "0000", "0110", "1010", "1101", "1111", "0011", "0101", "1000"},
        {"0010", "0001", "1110", "0111", "0100", "1010", "1000", "1101", "1111", "1100", "1001", "0000", "0011", "0101", "0110", "1011"}};
        String inicial = "", medio = "", finall = "";
        inicial = "" + clav.charAt(0) + clav.charAt(5);
        medio = "" + clav.charAt(1) + clav.charAt(2) + clav.charAt(3) + clav.charAt(4);
        int fila = 0;
        int columna = 0;
        if (inicial.equals("00")) {
            fila = 0;
        } else 
			if (inicial.equals("01")) {
            fila = 1;
        } else 
			if (inicial.equals("10")) {
            fila = 2;
        } else 
			if (inicial.equals("11")) {
            fila = 3;
        }
        if (medio.equals("0000")) {
            columna = 0;
        }
        if (medio.equals("0001")) {
            columna = 1;
        }
        if (medio.equals("0010")) {
            columna = 2;
        }
        if (medio.equals("0011")) {
            columna = 3;
        }
        if (medio.equals("0100")) {
            columna = 4;
        }
        if (medio.equals("0101")) {
            columna = 5;
        }
        if (medio.equals("0110")) {
            columna = 6;
        }
        if (medio.equals("0111")) {
            columna = 7;
        }
        if (medio.equals("1000")) {
            columna = 8;
        }
        if (medio.equals("1001")) {
            columna = 9;
        }
        if (medio.equals("1010")) {
            columna = 10;
        }
        if (medio.equals("1011")) {
            columna = 11;
        } else 
			if (medio.equals("1100")) {
            columna = 12;
        }
        if (medio.equals("1101")) {
            columna = 13;
        }
        if (medio.equals("1110")) {
            columna = 14;
        }
        if (medio.equals("1111")) {
            columna = 15;
        }
        finall = finall + S1[fila][columna];
        return finall;
    }
}