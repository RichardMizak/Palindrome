int ost=0;
int num=0;
    int sustava=0;
        do {
            System.out.println("Zadaj číslo v desiatkovej sústave:");
            Scanner n = new Scanner(System.in);
            num = n.nextInt();
            if(num<=0)
                System.out.println("Číslo musí byť vačšie ako 0");
        }while(num<=0);
        do{
            System.out.println("Zadaj sústavu do ktorej chceš číslo previesť. Môže byť 2, 8 alebo 16:");
            Scanner s=new Scanner(System.in);
            sustava= s.nextInt();
            if(sustava==2 || sustava==8 || sustava==16)
                if (sustava==2){
                    String bin = Integer.toBinaryString(num);
                    System.out.println("Desiatková do binárnej: "+bin);
                    break;
                }
                if (sustava==8){
                    String str="";
                    char dig[]={'0','1','2','3','4','5','6','7'};
                    while(num>0){
                        ost=num%8;
                        str=dig[ost]+str;
                        num=num/8;
                    }
                    System.out.println("Desiatková do osmičkovej: "+str);
                    break;
                }
                    if(sustava==16){
                        String str2="";
                        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        while(num>0){
                           ost=num%16;
                            str2=hex[ost]+str2;
                            num=num/16;
                        }
                        System.out.println("Desiatková do šestkovej: "+str2);
                        break;
                    }
        }while(sustava==2 || sustava==8 || sustava==16);
       if(sustava!=2){
           if(sustava!=16)
               if(sustava!=8)
           System.out.println("Súsatva nebola nájdená.");

        }

            }
}