package num8;

public class Test {
	  public static void main(String[] args) {
	        /**
	        Integer i1 = 128;  // װ�䣬�൱�� Integer.valueOf(128);
	        int t = i1; //�൱�� i1.intValue() ����
	        System.out.println(t);
	        */

	        /**
	        ���ڨC128��127��Ĭ����127��֮���ֵ,��װ��󣬻ᱻ�����ڴ����������
	        ����������������ֵ,ϵͳ������new һ������
	        */
	        Integer i1 = 200;
	        Integer i2 = 200;
	        String a = "q";
	        String b = "q";
	        String c = new String("q");

	        /**
	        ע�� == �� equals������
	        == ���Ƚϵ��Ƕ���ĵ�ַ
	        equals �Ƚϵ��Ƕ��������
	        */
	        if(i1==i2) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	        if(a==b) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	        if(a==c) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	    }
	}

