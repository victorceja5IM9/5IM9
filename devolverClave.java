/**
 *
 * @author Vicas Ceja
 */
public class devolverClave {
    String clav="0000000100100011010001010110011110001001101010111100110111101111";
     char no1=clav.charAt(57),	no2=clav.charAt(49),	no3=clav.charAt(41),	no4=clav.charAt(33),	no5=clav.charAt(25),	no6=clav.charAt(17),	no7=clav.charAt(9),	no8=clav.charAt(1),
     no9=clav.charAt(59),	no10=clav.charAt(51),	no11=clav.charAt(43),	no12=clav.charAt(35),	no13=clav.charAt(27),	no14=clav.charAt(19),	no15=clav.charAt(11),	no16=clav.charAt(3),
     no17=clav.charAt(61),	no18=clav.charAt(53),	no19=clav.charAt(45),	no20=clav.charAt(37),	no21=clav.charAt(29),	no22=clav.charAt(21),	no23=clav.charAt(13),
     no24=clav.charAt(5),	no25=clav.charAt(63),	no26=clav.charAt(55),	no27=clav.charAt(47),	no28=clav.charAt(39),	no29=clav.charAt(31),
     no30=clav.charAt(23),	no31=clav.charAt(15),	no32=clav.charAt(7),	no33=clav.charAt(56),
     no34=clav.charAt(48),	no35=clav.charAt(40),	no36=clav.charAt(32),	no37=clav.charAt(24),	no38=clav.charAt(16),	no39=clav.charAt(8),
     no40=clav.charAt(0),	no41=clav.charAt(58),	no42=clav.charAt(50),	no43=clav.charAt(42),	no44=clav.charAt(34),	no45=clav.charAt(26),
     no46=clav.charAt(18),	no47=clav.charAt(10),	no48=clav.charAt(2),	no49=clav.charAt(60),	no50=clav.charAt(52),	no51=clav.charAt(44),
     no52=clav.charAt(36),	no53=clav.charAt(28),	no54=clav.charAt(20),	no55=clav.charAt(12),	no56=clav.charAt(4),
	 no57=clav.charAt(62),	no58=clav.charAt(54),	no59=clav.charAt(46),	no60=clav.charAt(38),	no61=clav.charAt(30),
     no62=clav.charAt(22),	no63=clav.charAt(14),	no64=clav.charAt(6);
    String clav2="";
    char permutado[]=new char[64];
    public String devolverClave(){

        permutado[0]=no1;	permutado[19]=no20;	permutado[38]=no39;	permutado[57]=no58;
        permutado[1]=no2;	permutado[20]=no21;	permutado[39]=no40;	permutado[58]=no59;
        permutado[2]=no3;	permutado[21]=no22;	permutado[40]=no41;	permutado[59]=no60;
        permutado[3]=no4;	permutado[22]=no23;	permutado[41]=no42;	permutado[60]=no61;
        permutado[4]=no5;	permutado[23]=no24;	permutado[42]=no43;	permutado[61]=no62;
        permutado[5]=no6;	permutado[24]=no25;	permutado[43]=no44;	permutado[62]=no63;
        permutado[6]=no7;	permutado[25]=no26;	permutado[44]=no45;	permutado[63]=no64;
        permutado[7]=no8;	permutado[26]=no27;	permutado[45]=no46;	permutado[8]=no9;
       	permutado[27]=no28;	permutado[46]=no47;	permutado[9]=no10;	permutado[28]=no29;
        permutado[47]=no48;	permutado[10]=no11;	permutado[29]=no30;	permutado[48]=no49;
        permutado[11]=no12;	permutado[30]=no31;	permutado[49]=no50; permutado[12]=no13;
       	permutado[31]=no32;	permutado[50]=no51;	permutado[13]=no14;	permutado[32]=no33;
		permutado[51]=no52;	permutado[14]=no15;	permutado[33]=no34;	permutado[52]=no53;
        permutado[15]=no16;	permutado[34]=no35;	permutado[53]=no54;	permutado[16]=no17;
       	permutado[35]=no36;	permutado[54]=no55;	permutado[17]=no18;	permutado[36]=no37;
       	permutado[55]=no56;	permutado[18]=no19;	permutado[37]=no38;	permutado[56]=no57;
        
        String c0="";
        String d0="";
        for (int i = 0; i < 32; i++) {
            c0=c0+permutado[i];
        }
        for (int i = 32; i <64 ; i++) {
            d0=d0+permutado[i];
        }
        clav2=c0+d0;
        return clav2;
    }
}