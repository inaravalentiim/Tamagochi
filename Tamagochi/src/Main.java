import java.lang.Math;

public class Main {
	//Classe que segue toda a lógica do programa//
    public static void main(String[] args){//INARA DA CUNHA VALENTIM
        //Declaração das variáveis, sendo algumas inicializadas em zero para somar ao longo do programa//
        String nome;
        int comer;
        int exercitar;
        int idade = 0;
        double peso = 1;
        int dormir = 0;
        double p = 0;
        
        //Interface de início//
        System.out.println("\n\n▁ ▂ ▃ ▄ ▅ ▆ ▇ ▉ Olá!Seja bem-vindo ao seu Tamagochi! ▉ ▇ ▆ ▅ ▄ ▃ ▂ ▁");
        //Usuário colocará o nome do Tamagochi//
        String nomeT = Teclado.leString("\n\n☛Seu Tamagochi precisa de um nome!\nQual nome deseja colocar em seu Tamagochi?");
        //Informando os dados iniciais do Tamagochi//
        System.out.println("\n\n✹Incrível!✹\n" + nomeT + " ,por enquanto possui apenas 0 dias de idade e pesa 1 quilo! \n\n✹Divirta-se e cuide bem de seu Tamagochi!✹\n\n");
        
        //While com condições de morte do Tamagochi, que resulta no fim do programa//
        while (idade < 15 || peso < 20 || peso > 0){
            //Sorteio das ações do Tamagochi,onde 1 é sono,2 é fome e 3 é o tédio//
            int sorteio = (int)(Math.random() * 3) + 1;
            //Caso o resultado do Math.random seja 1, ele irá iniciar as ações de sentir sono//
            if (sorteio == 1){
                System.out.println("\n\n☾Seu Tamagochi está com sono... O que você deseja fazer?☾\n\n");
                //Opções para o usuário seguir//
                int sonoOp = Teclado.leInt("\nSe você deseja que:\n" + nomeT + " durma,digite a opção 1\nOu se deseja que ele continue acordado,digite a opção 2.\n");
                //Informando a opção//
                System.out.println("\nSua escolha foi a opção: " + sonoOp );
                //Caso a opção 1 seja colocada, o Tamagochi irá dormir e envelhecer um dia.//
                if (sonoOp == 1){ 
                    System.out.println("\n\n☾Seu Tamagochi está dormindo...☾");
                    idade ++;
                    System.out.println("\n\n🎂 Seu Tamagochi agora tem " + idade + "  dias de idade! 🎂\n");
                    //Se sua idade chegar em 15 dias, ele morre//
                    if (idade == 15){
                        System.out.println("\n\n\n☹Seu Tamagochi chegou a 15 dias de idade...Infelizmente ele morreu ☹");
                        break;
                    }
                }
                //Se a opção colocada for 2, o Tamagochi vai ficar acordado 5 vezes apenas,depois disso ele é forçado a dormir//
                else if (sonoOp == 2){
                    System.out.println("\n\n☀Você mandou seu Tamagochi ficar acordado...☀");
                    dormir ++;
                    if (dormir > 5){
                        System.out.println("\n\n\nATENÇÃO:seu Tamagochi acabou dormindo de tão cansado...");
                        System.out.println("\n☾Seu Tamagochi está dormindo...☾");
                        idade ++;
                        //Aqui também envelhece um dia//
                        System.out.println("\n\n🎂 Seu Tamagochi agora tem " + idade + " dias de idade! 🎂\n");
                    }
                    //Se sua idade chegar em 15 dias, ele morre//
                    if (idade == 15){
                        System.out.println("\n\n\n☹Seu Tamagochi chegou a 15 dias de idade...Infelizmente ele morreu ☹");
                        break;
                    }
                }
            }
            
            //Caso o resultado do Math.random seja 2, ele irá iniciar as ações de sentir fome//
            
            if (sorteio == 2){
                System.out.println("\n\n🧀 Seu Tamagochi esta com fome...O que você deseja fazer? 🧀");
                //Opções para o usuário seguir//
                int fomeOp  = Teclado.leInt("\nSe você deseja que\n " + nomeT + "  Coma muito,digite a opção 1 \nSe você deseja que ele coma pouco,digite 2 \nSe prefere que ele não coma,digite 3");
                //Informando a opção//
                System.out.println("\nSua escolha foi a opção: " + fomeOp );
                //Caso a opção 1 seja colocada, o Tamagochi irá comer muito,engordar e dormir logo em seguida//
                if (fomeOp == 1){
                    System.out.println("\n\n🧀🥕🍗 Seu Tamagochi comeu muito! Ele engordou 5 quilos e logo irá adormecer... 🍗🥕🧀");
                    peso = peso + 5;
                    //Quando ele come muito, seu peso aumenta 5 quilos//
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    System.out.println("\n☾Seu Tamagochi começou a dormir...☾");
                    idade ++;
                    //Aqui também envelhece um dia//
                    System.out.println("\n\n🎂 Seu Tamagochi agora tem " + idade + " dias de idade! 🎂\n");
                    //Condições de morte do Tamagochi,ter mais de 20 quilos, ficar desnutrido e ter mais de 15 dias de idade//
                    if (peso >= 20){
                        System.out.println("\n\n\n☹ Seu Tamagochi comeu tanto que explodiu!...Infelizmente ele morreu ☹");
                        break;
                    }
                    if (peso <= 0){
                        System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                        break;
                    }
                    if (idade == 15){
                        System.out.println("\n\n\n☹ Seu Tamagochi chegou a 15 dias de idade...Infelizmente ele morreu ☹");
                        break;
                    }
                }
                //Caso a opção 2 seja colocada, o Tamagochi irá comer pouco e engordar 1 quilo //
                if (fomeOp == 2){
                    System.out.println("\n\n🍗 Seu Tamagochi comeu pouco!Ele irá engordar 1 quilo! 🍗");
                    peso ++;
                    //Quando ele come pouco, seu peso aumenta 1 quilo apenas//
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    //Condições de morte do Tamagochi,ter mais de 20 quilos e ficar desnutrido//
                    if (peso >= 20){
                        System.out.println("\n\n\n☹ Seu Tamagochi comeu tanto que explodiu!...Infelizmente ele morreu ☹");
                        break;
                    }
                    if (peso <= 0){
                        System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                        break;
                    }
                }
                //Caso a opção 3 seja colocada, o Tamagochi não irá comer pouco e emagrecer 2 quilos //
                if (fomeOp == 3){
                    System.out.println("\n\n✕ Seu Tamagochi não comeu!Ele irá emagrecer -2 quilos! ✕");
                    peso = peso - 2;
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    //Condições de morte do Tamagochi: ficar desnutrido//
                    if (peso <= 0){
                        System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                        break;
                    }
                }
            }
                
            //Caso o resultado do Math.random seja 3, ele irá iniciar as ações de sentir tédio//
            
            if (sorteio == 3){
                System.out.println("\n\n⌚ Seu Tamagochi está entediado...O que deseja fazer? ⌚");
                //Opções para o usuário seguir//
                int exercOp  = Teclado.leInt("\nSe deseja que:\n" + nomeT + "Corra 10 minutos,digite 1 \nOu se deseja que ele caminhe 10 minutos,digite 2");
                //Informando a opção//
                System.out.println("\nSua escolha foi a opção: " + exercOp );
                //Caso a opção 1 seja colocada, o Tamagochi irá correr 10 minutos,emagrecendo 4 quilos e comer muito em seguida//
                if (exercOp == 1){
                    System.out.println("\n\n➴ Seu Tamagochi correu 10 minutos, logo ele emagreceu 4 quilos e irá comer muito! ➴");
                    peso = peso - 4;
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    //Quando ele come muito, seu peso aumenta 5 quilos//
                    System.out.println("\n🧀🥕🍗 Seu Tamagochi comeu muito! Ele engordou 5 quilos e logo irá adormecer... 🍗🥕🧀");
                    peso = peso + 5;
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    System.out.println("\n☾Seu Tamagochi começou a dormir...☾");
                    idade ++;
                    //Aqui também envelhece um dia//
                    System.out.println("\n\n🎂 Seu Tamagochi agora tem " + idade + " dias de idade! 🎂\n");
                    //Condições de morte do Tamagochi,ter mais de 20 quilos,ficar desnutrido e ter mais de 15 dias de vida//
                    if (peso >= 20){
                            System.out.println("\n\n\n☹ Seu Tamagochi comeu tanto que explodiu!...Infelizmente ele morreu ☹");
                            break;
                    }
                    if (peso <= 0){
                            System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                            break;
                    }
                    if (idade == 15){
                            System.out.println("\n\n\n☹ Seu Tamagochi chegou a 15 dias de idade...Infelizmente ele morreu ☹");
                            break;
                    }
                }
                //Caso a opção 2 seja colocada, o Tamagochi irá caminhar 10 minutos,emagrecendo 1 quilo e ficar com fome//
                if (exercOp == 2){
                    System.out.println("\n\n➴ Seu Tamagochi caminhou 10 minutos, logo ele emagreceu 1 quilos e está com fome! ➴");
                    peso = peso - 1;
                    System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                    //Informando o usuário que o Tamagochi está com fome//
                    System.out.println("\n🧀 Seu Tamagochi esta com fome...O que você deseja fazer? 🧀");
                    //Informando a opção//
                    int fomeOp  = Teclado.leInt("\nSe você deseja que\n" + nomeT + " coma muito,digite 1.\nSe você deseja que ele coma pouco,digite 2 \nSe prefere que ele não coma,digite 3");
                    //Caso a opção 1 seja colocada, o Tamagochi irá comer muito,engordar e dormir logo em seguida//
                    if (fomeOp == 1){
                        System.out.println("\n\n🧀🥕🍗 Seu Tamagochi comeu muito! Ele engordou 5 quilos e logo irá adormecer... 🍗🥕🧀");
                        peso = peso + 5;
                        //Engorda 5 quilos pois comeu muito//
                        System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                        System.out.println("\n☾Seu Tamagochi começou a dormir...☾");
                        idade ++;
                        //Aqui também envelhece um dia//
                        System.out.println("\n\n🎂 Seu Tamagochi agora tem " + idade + " dias de idade! 🎂\n");
                        //Condições de morte do Tamagochi,ter mais de 20 quilos,ficar desnutrido e ter mais de 15 dias de vida//
                        if (peso >= 20){
                            System.out.println("\n\n\n☹ Seu Tamagochi comeu tanto que explodiu!...Infelizmente ele morreu ☹");
                            break;
                        }
                        if (peso <= 0){
                            System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                            break;
                        }
                        if (idade == 15){
                            System.out.println("\n\n\n☹ Seu Tamagochi chegou a 15 dias de idade...Infelizmente ele morreu ☹");
                            break;
                        }
                    }
                    //Caso a opção 2 seja colocada, o Tamagochi irá comer pouco e engordar um quilo //
                    if (fomeOp == 2){
                        System.out.println("\n\n🍗 Seu Tamagochi comeu pouco!Ele irá engordar 1 quilo! 🍗");
                        peso ++;
                        //Engorda um quilo pois comeu pouco//
                        System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                        //Condições de morte do Tamagochi,ter mais de 20 quilos e ficar desnutrido//
                        if (peso >= 20){
                            System.out.println("\n\n\n☹ Seu Tamagochi comeu tanto que explodiu!...Infelizmente ele morreu ☹");
                            break;
                        }
                        if (peso <= 0){
                            System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                            break;
                        }
                    }
                    //Caso a opção 3 seja colocada, o Tamagochi não irá comer e irá emagrecer 2 quilos //
                    if (fomeOp == 3){
                        System.out.println("\n\n✕ Seu Tamagochi não comeu! Ele irá emagrecer -2 quilos! ✕");
                        peso = peso- 2;
                        //Emagrece pois não come nada//
                        System.out.println("\n⬤ Seu Tamagochi agora tem " + peso + " quilos ⬤");
                        //Condições de morte do Tamagochi: ficar desnutrido//
                        if (peso <= 0){
                            System.out.println("\n\n\n☹ Seu Tamagochi ficou desnutrido... Infelizmente ele morreu ☹");
                            break;
                        }
                    }
                }
            }
        }   
    }
}
