/**
 *
 * @author Vicas Ceja
 */
public class devolverClave {
    String clav="0000000100100011010001010110011110001001101010111100110111101111";
    char no1=clav.charAt(57),no2=clav.charAt(49),no3=clav.charAt(41),no4=clav.charAt(33),no5=clav.charAt(25),no6=clav.charAt(17),no7=clav.charAt(9),no8=clav.charAt(1);
    char no9=clav.charAt(59),no10=clav.charAt(51),no11=clav.charAt(43),no12=clav.charAt(35),no13=clav.charAt(27),no14=clav.charAt(19),no15=clav.charAt(11),no16=clav.charAt(3);
    char no17=clav.charAt(61),no18=clav.charAt(53),no19=clav.charAt(45),no20=clav.charAt(37),no21=clav.charAt(29),no22=clav.charAt(21),no23=clav.charAt(13);
    char no24=clav.charAt(5),no25=clav.charAt(63),no26=clav.charAt(55),no27=clav.charAt(47),no28=clav.charAt(39),no29=clav.charAt(31);
    char no30=clav.charAt(23),no31=clav.charAt(15),no32=clav.charAt(7),no33=clav.charAt(56);
    char no34=clav.charAt(48),no35=clav.charAt(40),no36=clav.charAt(32),no37=clav.charAt(24),no38=clav.charAt(16),no39=clav.charAt(8);
    char no40=clav.charAt(0),no41=clav.charAt(58),no42=clav.charAt(50),no43=clav.charAt(42),no44=clav.charAt(34),no45=clav.charAt(26);
    char no46=clav.charAt(18),no47=clav.charAt(10),no48=clav.charAt(2),no49=clav.charAt(60),no50=clav.charAt(52),no51=clav.charAt(44);
    char no52=clav.charAt(36),no53=clav.charAt(28),no54=clav.charAt(20),no55=clav.charAt(12),no56=clav.charAt(4);       
    char no57=clav.charAt(62),no58=clav.charAt(54),no59=clav.charAt(46),no60=clav.charAt(38),no61=clav.charAt(30);
    char no62=clav.charAt(22),no63=clav.charAt(14),no64=clav.charAt(6);
    String clav2="";
    char permutadoUno[]=new char[64];
    public String devolverClave(){

        permutadoUno[0]=no1;permutadoUno[19]=no20;permutadoUno[38]=no39;permutadoUno[57]=no58;
        permutadoUno[1]=no2;permutadoUno[20]=no21;permutadoUno[39]=no40;permutadoUno[58]=no59;
        permutadoUno[2]=no3;permutadoUno[21]=no22;permutadoUno[40]=no41;permutadoUno[59]=no60;
        permutadoUno[3]=no4;permutadoUno[22]=no23;permutadoUno[41]=no42;permutadoUno[60]=no61;
        permutadoUno[4]=no5;permutadoUno[23]=no24;permutadoUno[42]=no43;permutadoUno[61]=no62;
        permutadoUno[5]=no6;permutadoUno[24]=no25;permutadoUno[43]=no44;permutadoUno[62]=no63;
        permutadoUno[6]=no7;permutadoUno[25]=no26;permutadoUno[44]=no45;permutadoUno[63]=no64;
        permutadoUno[7]=no8;permutadoUno[26]=no27;permutadoUno[45]=no46;
        permutadoUno[8]=no9;permutadoUno[27]=no28;permutadoUno[46]=no47;
        permutadoUno[9]=no10;permutadoUno[28]=no29;permutadoUno[47]=no48;
        permutadoUno[10]=no11;permutadoUno[29]=no30;permutadoUno[48]=no49;
        permutadoUno[11]=no12;permutadoUno[30]=no31;permutadoUno[49]=no50;
        permutadoUno[12]=no13;permutadoUno[31]=no32;permutadoUno[50]=no51;
        permutadoUno[13]=no14;permutadoUno[32]=no33;permutadoUno[51]=no52;
        permutadoUno[14]=no15;permutadoUno[33]=no34;permutadoUno[52]=no53;
        permutadoUno[15]=no16;permutadoUno[34]=no35;permutadoUno[53]=no54;
        permutadoUno[16]=no17;permutadoUno[35]=no36;permutadoUno[54]=no55;
        permutadoUno[17]=no18;permutadoUno[36]=no37;permutadoUno[55]=no56;
        permutadoUno[18]=no19;permutadoUno[37]=no38;permutadoUno[56]=no57;
        String c0="";
        String d0="";
        for (int i = 0; i < 32; i++) {
            c0=c0+permutadoUno[i];
        }
        for (int i = 32; i <64 ; i++) {
            d0=d0+permutadoUno[i];
        }
        clav2=c0+d0;
        return clav2;
    }
}
