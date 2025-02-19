
import java.util.Scanner;

public class WarenautomatDriver {

    public static void main(String[] args) {

        double bezahlung;

        Scanner scan = new Scanner(System.in);

        String[] artikel = new String[6];

        artikel[0] = "Cola    ";
        artikel[1] = "Fanta   ";
        artikel[2] = "Red Bull";
        artikel[3] = "Spezi   ";
        artikel[4] = "Snickers";
        artikel[5] = "Twix    ";

        double[] preis = new double[6];

        preis[0] = 2;
        preis[1] = 1.50;
        preis[2] = 1.50;
        preis[3] = 1;
        preis[4] = 0.50;
        preis[5] = 2.50;

        System.out.println("Welcome to SchawarzwaldAutomaten");

        for (int i = 0; i < artikel.length; i++) {
            System.out.println("|" + artikel[i] + "|" + preis[i] + "|" + i + "|");

        }

        System.out.println();
        System.out.println("Wählen Sie ein Artikel Nummer:");
        short artikelNummer = scan.nextShort();

        switch (artikelNummer) {
            case 0:
                System.out.println("Gewählte Atikel Nr. 0 " + artikel[0].trim() + " : " + preis[0] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[0]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[0]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[0]) + "€");

                    }
                    System.out.println(
                            "     .+*******.\n" +
                                    "     .+*******.\n" +
                                    "     .*+####*#.\n" +
                                    "     .-......-.\n" +
                                    "      :......: \n" +
                                    "     :..:...-..\n" +
                                    "    .-.... ...:\n" +
                                    "  ..%#***++*#%%%.\n" +
                                    " .##*++===+**##%.\n" +
                                    "..+******==+*###**..\n" +
                                    ".-%+*#+#+++*%#%###+.\n" +
                                    ":@***%%##**#%%%%%*#.\n" +
                                    "#@###%%##**##%%%##@%\n" +
                                    "-*==+**********++=*-\n" +
                                    ":+==-.+%#:+*=:#*==+-\n" +
                                    ":*==+**********+==*:\n" +
                                    ":+==-********:..=:*:\n" +
                                    ":+.=++*-#**.*=*+:=+:\n" +
                                    ":==:+*..+#..%.#..:+:\n" +
                                    ":*..+#.-*#.#:=#===+:\n" +
                                    ":+==+**********++=+:\n" +
                                    "#@#%%@%%#**#*#%%%%@%\n" +
                                    ".@%%%%%#*++*##%%%@%.\n" +
                                    ".%%%%%#*+==+*#%%%@@.\n" +
                                    ".*%#%%#*+==++*#%#%+.\n" +
                                    "..**##*+===++*##*#:.\n" +
                                    "..#####*+==++#####..\n" +
                                    "..#%%%%#****##%#@%..\n" +
                                    "..%%#%%%##%##%%%#%..\n" +
                                    " .@%#%@%%%#%%@%%@%..\n" +
                                    ".#%*#%@#=###@@%%#@#.\n" +
                                    "=@*####*++++*####%%.\n" +
                                    "+@#%%##+====+*#%%%@+\n" +
                                    ":@@@%***=+++***%@@@.\n" +
                                    ".@@@@@#%***#%#%@@@@.\n" +
                                    ".#@@@@@@@%@@%@@@@@#.\n" +
                                    " .#@@@:.@@@@..@@@*..");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;
            case 1:
                System.out.println("Gewählte Atikel Nr. 1 " + artikel[1].trim() + " : " + preis[1] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[1]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[1]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[1]) + "€");

                    }

                    System.out.println("                                                                 ");
                    System.out.println("                             --=--=-=                             ");
                    System.out.println("                             ---:---=                             ");
                    System.out.println("                             -....::-                             ");
                    System.out.println("                                                                 ");
                    System.out.println("                                                                 ");
                    System.out.println("                            ::.:.:::::                            ");
                    System.out.println("                           :.........::                           ");
                    System.out.println("                          ::..........:.                          ");
                    System.out.println("                          :.....  .....:                          ");
                    System.out.println("                         :...:.   .... ::                         ");
                    System.out.println("                         :: .:.   ......-                         ");
                    System.out.println("                         --:--....----:-=                         ");
                    System.out.println("                         ---==--+-:-.-.:=                         ");
                    System.out.println("                         -  ****+.    -==                         ");
                    System.out.println("                         -.:=.=    # =.-=                         ");
                    System.out.println("                         -=-:# : + #.*+==                         ");
                    System.out.println("                         --==:.  **::-:-=                         ");
                    System.out.println("                         --:-.-+*+*-----=                         ");
                    System.out.println("                         --:---:::----:-=                         ");
                    System.out.println("                         :. ...   .:..:.:                         ");
                    System.out.println("                         :. .........:.:.                         ");
                    System.out.println("                         :: ..........::                          ");
                    System.out.println("                         .:.........:..                           ");
                    System.out.println("                          :.......:.:::                           ");
                    System.out.println("                          ::.......::.::                          ");
                    System.out.println("                           .:..........:                          ");
                    System.out.println("                          .:::..   ....-.                         ");
                    System.out.println("                         .::..:.. .... .:                         ");
                    System.out.println("                         ::.............:                         ");
                    System.out.println("                         ::............::                         ");
                    System.out.println("                         :::.......... .:                         ");
                    System.out.println("                         :.:::......::..                          ");
                    System.out.println("                         .:..:.....:...:                          ");
                    System.out.println("                          .:::::.::::.:                           ");
                    System.out.println("                                                                 ");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;
            case 2:
                System.out.println("Gewählte Atikel Nr. 2 " + artikel[2].trim() + " : " + preis[2] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[2]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[2]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[2]) + "€");

                    }
                    System.out.println(
                            "                 .-. \n" +
                                    "                /()) \n" +
                                    "          .-'\"\"////\"`-. \n" +
                                    "         (.-##| ''   ) ) \n" +
                                    "         |`-._______.-'| \n" +
                                    "         |::::::::::   | \n" +
                                    "         |:::::::::'   | \n" +
                                    "         |:::::::::    | \n" +
                                    "         |::::::::'    | \n" +
                                    "         |::::::::     | \n" +
                                    "         ||):::|:|)  ||| \n" +
                                    "         ||\\(/(|:|)LJ||| \n" +
                                    "         |::::::-.     | \n" +
                                    "         |`-Z-'\\ /`-S-:| \n" +
                                    "         |  /->dVb<-\\::| \n" +
                                    "         |     `-::::::| \n" +
                                    "         |     ::::::::| \n" +
                                    "         |     ::::::::| \n" +
                                    "         |    .::::::::| \n" +
                                    "         |    :::::::::| \n" +
                                    "         |    :::::::::| \n" +
                                    "         |   ::::::::::| \n" +
                                    "         |.  ::::::::::| \n" +
                                    "         |::.'''''     | \n" +
                                    "         |  `......::::| \n" +
                                    "          `-:::::::::-' \n");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;
            case 3:
                System.out.println("Gewählte Atikel Nr. 3 " + artikel[3].trim() + " : " + preis[3] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[3]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[3]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[3]) + "€");

                    }

                    System.out.println(
                            "                           #### ########                            \n" +
                                    "                           ###.+.  . ###                            \n" +
                                    "                           ###     ##-##                            \n" +
                                    "                           ###  #####-##                            \n" +
                                    "                            ## +##### ##                            \n" +
                                    "                            ## +-- ## ##                            \n" +
                                    "                           ### -#+ ## ##                            \n" +
                                    "                           ##-. #####.##                            \n" +
                                    "                           ## - .###--###                           \n" +
                                    "                          .###########+##                           \n" +
                                    "                          -### .+-  -#-##                           \n" +
                                    "                          +  #-++- - . ###                          \n" +
                                    "                         ++ .#.        .##                          \n" +
                                    "                        -### #+####- -#-.##                         \n" +
                                    "                        ##.+-#########-####-                        \n" +
                                    "                       ####.################.                       \n" +
                                    "                      +##################.###                       \n" +
                                    "                      ###-#-. ##.-. -#+-  -###                      \n" +
                                    "                      ##--...++####+##-    ###                      \n" +
                                    "                     #### + +-  ###+.      .##-                     \n" +
                                    "                     ##-# # +.              ###                     \n" +
                                    "                    .##++--.-..             +##                     \n" +
                                    "                    #### # .. -             -##.                    \n" +
                                    "                    ####.# -  .             -###                    \n" +
                                    "                    ##.#-# .. .             -###                    \n" +
                                    "                    ###+-#   ..             + ##                    \n" +
                                    "                    ####.#   --             + ##                    \n" +
                                    "                    ####.#   -+             + ##                    \n" +
                                    "                    ############################                    \n" +
                                    "                    ##############++#####-. .###                    \n" +
                                    "                    #####+--+### #######+##-.###                    \n" +
                                    "                    ## .+    # #+##-#+## -.- +##                    \n" +
                                    "                    #####+---##+-.###+##++#--###                    \n" +
                                    "                    ## +. .--####+ -#####+- .###                    \n" +
                                    "                    ###+++-  ..           .  +##                    \n" +
                                    "                    ##- .-  ----+-        .  ###                    \n" +
                                    "                    ##  .---####          .. +##                    \n" +
                                    "                    ##-.-+###..#-  +###+++++.###                    \n" +
                                    "                    ##   -##-#.##..#+  .+- .-###                    \n" +
                                    "                    ##   .+# #############+##+#+                    \n" +
                                    "                    ## .. ## #+###--.++  #.+###+                    \n" +
                                    "                    ##   .##+#+ ..#.-.-  #--#+#+                    \n" +
                                    "                    ## . .#-#+-###-.######+##+##                    \n" +
                                    "                    ## -++######################                    \n" +
                                    "                    ##-  --#-.--####         ###                    \n" +
                                    "                    ## +#    .-----.         ###                    \n" +
                                    "                    ## ##+  ...  .------.-.. ###                    \n" +
                                    "                    ##-+#+  .        .----.. ###                    \n" +
                                    "                    ##  -+. ...              ###                    \n" +
                                    "                    ##  ++--+--.            .-##                    \n" +
                                    "                    ##  -++++++-..      .   - ##                    \n" +
                                    "                    ## ...   .              + ##                    \n" +
                                    "                    ## . .  ..              +###                    \n" +
                                    "                    ###. ....               ####                    \n" +
                                    "                    +##########################                     \n");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;
            case 4:
                System.out.println("Gewählte Atikel Nr. 4 " + artikel[4].trim() + " : " + preis[4] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[4]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[4]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[4]) + "€");

                    }

                    System.out.println(
                            ".###%%%%=..                                                                                           ..#%%*%%%%%%.\n"
                                    +
                                    ".%%###%#%%==-..                                                                                     .%%-%%%%%%%%%%.\n"
                                    +
                                    ".%%%%%%#*%%%###+++++++++++****++++++*+++++*=---====+++*+***+*++++=====--=+**********************######*#%%%%%%###%.\n"
                                    +
                                    ".#%#####%%#==**#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##%%-\n"
                                    +
                                    "%#####%%%*%%%%%..%%%%%%%%%%%%%%##########################################################################%%%%%%%%%.\n"
                                    +
                                    ".%%%%%%%%*%:%%%:%.%%-=%%%%%%%###............  ...................... . .. .......... .....   ....... .##%%%%%%%%%%.\n"
                                    +
                                    ".%%%%%%%+*#%%+%%%%%%%%#%%%%%###..########.####..##:.####.########.###.####.%######.#######.+%######. ###%%%%%%%%%%.\n"
                                    +
                                    " %%%%%%+..##%%%%%%%%%%%%%%%%##..###%%###..####.=##.-##%.=#######.:###.###..###.   ###.#%##.###..### -##%%#%%%%%%%%.\n"
                                    +
                                    " %###%%++*::-:::::::%%%%%%%##. ####.....#%#######.*###.+###.###.%######.. ####   =###.###.-###......##%%%#%%%%####.\n"
                                    +
                                    ".%##%#%+**::%%%%@%::%%%%%%###. :####%  .##.#####.:###::###......######....#####.+%######..*####.  .##%%%%%%%%%%%%%.\n"
                                    +
                                    ".%%%%#%+**:::%%#::::%%%%%%##.   .=%##+.%##%####%.####.%##:####.###+##%  *###....###+%##    .####. *##%%%#%%%%%%%%%.\n"
                                    +
                                    ".%%%%#=+**:--:...:::%%%%%##..=###.###..##.####%..###..###.###.:###.### .###%  ..#######.###.###%..##%%%%%%%%%%%%%%.\n"
                                    +
                                    ".%%%##=%*%*::....:.*%%%%###.*###.%###*##..####.####.####.###.+###..###..###.  %###.###..###:###..##%%%%%%%%%%%%##%.\n"
                                    +
                                    ".#%%%#++%%%%%%%%:%%%%%%%## .######%..##% ####%.####..######..####..##########.###..###########..###%%%%%%%%%%%####.\n"
                                    +
                                    ".%%#%%%+%%%%..%.%%%%%%%##.....................................................................###%%%%%%%%%%%%%##%#.\n"
                                    +
                                    ".###%%%%*%%%=%.@##%%%%#########################################################################%%#%%%%%%%##%%%%%%%\n"
                                    +
                                    ".%%##%%#*#%%%%%%%%###############################################################################%%%%%#####%%%%%%%\n"
                                    +
                                    ".%%%%%##*%%%%#%%%=......   .                     .        .         .              .    .         .%#%%#%%%%%%%%%%.\n"
                                    +
                                    ".%#%%%%%%%##..                                                                                      .%%#%##%%%%#%%.\n"
                                    +
                                    " %%#%%%%#.                                                                                             . .#%%%%%%%\n"
                                    +
                                    "                                                                                                          ");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;
            case 5:
                System.out.println("Gewählte Atikel Nr. 5 " + artikel[5].trim() + " : " + preis[5] + "€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < preis[0]) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }
                } else {

                    if (bezahlung > preis[5]) {
                        System.out.println("Hier ist Wechselgeld " + (bezahlung - preis[5]) + "€");

                    }
                    System.out.println(
                            "#########                                                                       ######### \n"
                                    +
                                    "##########  ############          ##################                          ########### \n"
                                    +
                                    "#       ################################            #############################       # \n"
                                    +
                                    "#         ##                                      #### ####     #######   ####-         # \n"
                                    +
                                    "#                     ###   ##########           ######+###             ##              # \n"
                                    +
                                    "#                     # ##########   ###    #      #### # ##  #####   #### #      #     # \n"
                                    +
                                    "#                   ### ######   ##  ### ##  ### ## # # ####### ####### ##    ##  #     # \n"
                                    +
                                    "#                   ####    ###  # ######## ##### # #-# #  ##  ###  #####      ##       # \n"
                                    +
                                    "#            ###       ########  ####   # # #   # ##### ##  #### ##    ###  #   ###     # \n"
                                    +
                                    "#           ##      ####### # ##  #####  ####    ######  #  ### # # ### ####  #   # ### # \n"
                                    +
                                    "#            ###### #-     +####  ## ###  ######  #### ####  # # ######## # ###   # ### # \n"
                                    +
                                    "#                 #      # # # ##  ### ##  # ####    #  # #  ## #### #  #    ##   #   # # \n"
                                    +
                                    "#             ### #          ####  ## # ##   ###### ## ## ####### # ## #  ##### ## #  # # \n"
                                    +
                                    "#              #  #       # . # ##  #  # ##### ## # ## # #  ##  # ##  #  #          ### # \n"
                                    +
                                    "#            +####            ####### # ##    ###  #   ## ##  #####     -  #  #######   # \n"
                                    +
                                    "#          ########       #### ##  #####  #### ###       ##          ###    ######      # \n"
                                    +
                                    "#                            ##        #####                         #    #####         # \n"
                                    +
                                    "#############################################################################     # \n"
                                    +
                                    "######################################################################################### \n"
                                    +
                                    "#######                                                                           #######");

                    System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                    String input = scan.next();

                    if ("ja".equalsIgnoreCase(input)) {
                        main(args); // Restart the program
                    } else {
                        System.out.println("Auf Wiedersehen!");
                    }

                }
                break;

            default:
                System.out.println("Ungültige Artikel Nummer");
                break;
        }

    }
}