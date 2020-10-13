int ost=0;
int pow=0;
int num=0;
int sustava=0;
int decimal=0;
String array;
Scanner n=new Scanner(System.in);
        System.out.println("Select if you want to convert from decimal(1) or to decimal(2)");
        int conv= n.nextInt();
        if (conv==1 || conv==2)
            switch (conv){
            case 1:
                do {
                    System.out.println("Input decimal number:");
                    num = n.nextInt();
                    if(num<=0)
                        System.out.println("Number must be greater than 0");
                }while(num<=0);
                do{
                    System.out.println("Select whitch conversion do you want to perform (2,8,16) :");
                    Scanner s=new Scanner(System.in);
                    sustava= s.nextInt();
                    if(sustava==2 || sustava==8 || sustava==16)
                        switch(sustava){
                            case 2:
                                String bin = Integer.toBinaryString(num);
                                System.out.println("Decimal do binary"+bin);
                                break;

                            case 8:
                                String str="";
                                char dig[]={'0','1','2','3','4','5','6','7'};
                                while(num>0){
                                    ost=num%8;
                                    str=dig[ost]+str;
                                    num=num/8;
                                }
                                System.out.println("Decimal to octal"+str);
                                break;
                            case 16:
                                String str2="";
                                char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                                while(num>0){
                                    ost=num%16;
                                    str2=hex[ost]+str2;
                                    num=num/16;
                                }
                                System.out.println("Decimal to hexadecimal"+str2);
                                break;
                        }
                    break;
                }while(sustava==2 || sustava==8 || sustava==16);
                if(sustava!=2){
                    if(sustava!=16)
                        if(sustava!=8)
                            System.out.println("Súsatva nebola nájdená.");
                }
break;
                case 2:


        do{
            System.out.println("Select whitch conversion do you want to perform (2,8,16) :");
            Scanner s=new Scanner(System.in);
            sustava= s.nextInt();
            if(sustava==2 || sustava==8 || sustava==16)
                switch(sustava){
                    case 2:
                        System.out.println("Input binary number:");
                        num= n.nextInt();
                        while(true){
                            if(num <= 0){
                                break;
                            } else {
                                int temp = num%10;
                                decimal += temp*Math.pow(2, pow);
                                num = num/10;
                                pow++;
                            }
                        }
                        System.out.println("Binary to decimal" +decimal);
                        break;
                    case 8:
                        System.out.println("Input octal number:");
                        num= n.nextInt();
                        while(true){
                            if(num <= 0){
                                break;
                            } else {
                                int temp = num%10;
                                decimal += temp*Math.pow(8, pow);
                                num = num/10;
                                pow++;
                            }
                        }
                        System.out.println("Octal to decimal" +decimal);
                    break;
                    case 16:
                        System.out.println("Input hexadecimal number:");
                        Scanner ar=new Scanner(System.in);
                        array= ar.nextLine();
                        int length = array.length();
                        int sum = 0;


                        for(int i = length-1; i >=0; i--){
                            if(array.charAt(i) == '1'){
                                sum = sum + (array.charAt(i)-48)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '2'){
                                sum = sum + (array.charAt(i)-47)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '3'){
                                sum = sum + (array.charAt(i)-46)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '4'){
                                sum = sum + (array.charAt(i)-45)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '5'){
                                sum = sum + (array.charAt(i)-44)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '6'){
                                sum = sum + (array.charAt(i)-43)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '7'){
                                sum = sum + (array.charAt(i)-42)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '8'){
                                sum = sum + (array.charAt(i)-41)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == '9'){
                                sum = sum + (array.charAt(i)-40)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'A'){
                                sum = sum + (10)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'B'){
                                sum = sum + (11)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'C'){
                                sum = sum + (12)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'D'){
                                sum = sum + (13)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'E'){
                                sum = sum + (14)*(int)Math.pow(16,pow);
                            }else if(array.charAt(i) == 'F'){
                                sum = sum + (15)*(int)Math.pow(16,pow);
                            }
                            pow++;
                        }
                        System.out.println("Hexadecimal to decimal: " +sum);
                        break;
                }
            break;
        }while(sustava==2 || sustava==8 || sustava==16);
       if(sustava!=2){
           if(sustava!=16)
               if(sustava!=8)
           System.out.println("ERROR.");

        }