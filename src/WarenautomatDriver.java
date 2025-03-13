import java.util.Scanner;

public class WarenautomatDriver {

    public static void main(String[] args) {
        double bezahlung;

        Scanner scan = new Scanner(System.in);

        String[] artikel = new String[50];

        artikel[0] = "Cola";
        artikel[1] = "Fanta";
        artikel[2] = "Red Bull";
        artikel[3] = "Spezi";
        artikel[4] = "Snickers";
        artikel[5] = "Twix";

        double[] preis = new double[50];

        preis[0] = 2;
        preis[1] = 1.50;
        preis[2] = 1.50;
        preis[3] = 1;
        preis[4] = 0.50;
        preis[5] = 2.50;

        while (true) {
            System.out.println();
            System.out.println("Welcome to SchawarzwaldAutomaten");
            System.out.println("Für Wartungsmodus bitte 0 eingeben");
            System.out.println();

            for (int i = 0; i < artikel.length; i++) {
                if (artikel[i] != null) {
                    int maxLength = artikel[4].length();
                    int currentLength = artikel[i].length();

                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        i = 0;
                        break;
                    }

                    int diff = maxLength - artikel[i].length();

                    for (int j = 0; j < diff; j++) {
                        artikel[i] += " ";
                    }
                    System.out.println(
                        "| " +
                        artikel[i] +
                        " | " +
                        preis[i] +
                        " | " +
                        (i + 1) +
                        " |"
                    );
                }
            }

            System.out.println();
            System.out.println("Wählen Sie ein Artikel Nummer:");
            short artikelNummer = scan.nextShort();

            switch (artikelNummer) {
                case 0:
                    System.out.println("|-------------|");
                    System.out.println("|WARTUNGSMODUS|");
                    System.out.println("|-------------|");
                    System.out.println();
                    System.out.println("1 - Ware austascuhen / einfügen");
                    System.out.println("2 - Preise ändern");
                    System.out.println("3 - Ware löschen");
                    System.out.println("4 - Wartungsmodus beenden");
                    System.out.println();
                    System.out.println("Wählen Sie ein Nummer:");
                    short wartungsModusNummer = scan.nextShort();

                    switch (wartungsModusNummer) {
                        case 1:
                            System.err.println("Ware austascuhen / einfügen");
                            System.out.println();
                            for (int i = 0; i < artikel.length; i++) {
                                if (artikel[i] != null) {
                                    int maxLength = artikel[4].length();
                                    int currentLength = artikel[i].length();

                                    if (currentLength > maxLength) {
                                        maxLength = currentLength;
                                        i = 0;
                                        break;
                                    }

                                    int diff = maxLength - artikel[i].length();

                                    for (int j = 0; j < diff; j++) {
                                        artikel[i] += " ";
                                    }

                                    System.out.println(
                                        "| " +
                                        artikel[i] +
                                        " | " +
                                        preis[i] +
                                        " | " +
                                        i +
                                        " |"
                                    );
                                }
                            }
                            System.out.println();

                            System.err.println(
                                "Bitte geben Sie die zu extrahierenden Attributswerte oder die neuen Artikel-IDs für einen neuen Artikel (MAX: 50):"
                            );
                            int artikelNum = scan.nextShort();
                            if (artikel[artikelNum] != null) {
                                System.out.println(
                                    "| " +
                                    artikel[artikelNum] +
                                    " |" +
                                    preis[artikelNum] +
                                    "|" +
                                    artikelNum +
                                    "|"
                                );

                                System.out.println(
                                    "Bitte geben Sie den neuen Artikelnamen ein:"
                                );
                                artikel[artikelNum] = scan.next();
                                System.out.println(
                                    "Bitte geben Sie den neuen Artikel Preis ein:"
                                );
                                preis[artikelNum] = scan.nextDouble();
                                System.out.println(
                                    "Artikel erfolgreich geändert"
                                );
                            } else {
                                System.err.println("Artikel nicht gefunden!!");
                                System.out.println(
                                    "Bitte geben Sie den neuen Artikelnamen ein für Artikel neue Artikel :"
                                );
                                artikel[artikelNum] = scan.next();
                                System.out.println(
                                    "Bitte geben Sie den neuen Artikel Preis ein:"
                                );
                                preis[artikelNum] = scan.nextDouble();
                                System.out.println(
                                    "Artikel erfolgreich hinzugefügt"
                                );

                                System.out.println(
                                    artikel[artikelNum] +
                                    " | " +
                                    preis[artikelNum] +
                                    " | " +
                                    artikelNum
                                );

                                System.out.println();
                                System.out.println(
                                    "+-----------------------+---------+-------+"
                                );
                                System.out.println(
                                    "| Artikel              | Preis   | Nr.   |"
                                );
                                System.out.println(
                                    "+-----------------------+---------+-------+"
                                );

                                // Find maximum item name length for proper formatting
                                int maxNameLength = 22; // Default minimum width
                                for (int i = 0; i < artikel.length; i++) {
                                    if (
                                        artikel[i] != null &&
                                        artikel[i].length() > maxNameLength
                                    ) {
                                        maxNameLength = artikel[i].length();
                                    }
                                }

                                // Display all available items
                                for (int i = 0; i < artikel.length; i++) {
                                    if (artikel[i] != null) {
                                        // Format the item name with proper spacing
                                        String itemName = artikel[i];
                                        String formattedName = itemName;

                                        // Ensure the item name fits within the column
                                        if (itemName.length() > 22) {
                                            formattedName =
                                                itemName.substring(0, 19) +
                                                "...";
                                        } else {
                                            // Pad with spaces to align columns
                                            formattedName = String.format(
                                                "%-22s",
                                                itemName
                                            );
                                        }
                                        String formattedItemName =
                                            itemName.length() > 18
                                                ? itemName.substring(0, 15) +
                                                "..."
                                                : itemName;
                                        String formattedPrice = String.format(
                                            "%.2f€",
                                            preis[i]
                                        );

                                        System.out.println(
                                            "| " +
                                            String.format(
                                                "%-18s",
                                                formattedItemName
                                            ) +
                                            " | " +
                                            formattedPrice +
                                            " |"
                                        );
                                    }
                                }

                                System.out.println(
                                    "+-----------------------+---------+-------+"
                                );
                            }

                            break;
                        case 2:
                            System.err.println("Preise ändern");
                            System.out.println();
                            for (int i = 0; i < artikel.length; i++) {
                                if (artikel[i] != null) {
                                    int maxLength = artikel[4].length();
                                    int currentLength = artikel[i].length();

                                    if (currentLength > maxLength) {
                                        maxLength = currentLength;
                                        i = 0;
                                        break;
                                    }

                                    int diff = maxLength - artikel[i].length();

                                    for (int j = 0; j < diff; j++) {
                                        artikel[i] += " ";
                                    }

                                    System.out.println(
                                        "| " +
                                        artikel[i] +
                                        " | " +
                                        preis[i] +
                                        " | " +
                                        i +
                                        " |"
                                    );
                                }
                            }
                            System.out.println();
                            System.out.println(
                                "Bitte geben Sie die Artikelnummer ein, dessen Preis Sie ändern möchten:"
                            );
                            artikelNummer = scan.nextShort();
                            System.out.println(
                                "Bitte geben Sie den neuen Preis ein:"
                            );
                            preis[artikelNummer] = scan.nextDouble();
                            System.out.println("Preis erfolgreich geändert");
                            System.out.println();
                            for (int i = 0; i < artikel.length; i++) {
                                if (artikel[i] != null) {
                                    int maxLength = artikel[4].length();
                                    int currentLength = artikel[i].length();

                                    if (currentLength > maxLength) {
                                        maxLength = currentLength;
                                        i = 0;
                                        break;
                                    }

                                    int diff = maxLength - artikel[i].length();

                                    for (int j = 0; j < diff; j++) {
                                        artikel[i] += " ";
                                    }

                                    System.out.println(
                                        "| " +
                                        artikel[i] +
                                        " | " +
                                        preis[i] +
                                        " | " +
                                        i +
                                        " |"
                                    );
                                }
                            }

                            break;
                        case 3:
                            System.err.println("Ware löschen");
                            System.out.println();
                            for (int i = 0; i < artikel.length; i++) {
                                if (artikel[i] != null) {
                                    int maxLength = artikel[4].length();
                                    int currentLength = artikel[i].length();

                                    if (currentLength > maxLength) {
                                        maxLength = currentLength;
                                        i = 0;
                                        break;
                                    }

                                    int diff = maxLength - artikel[i].length();

                                    for (int j = 0; j < diff; j++) {
                                        artikel[i] += " ";
                                    }

                                    System.out.println(
                                        "| " +
                                        artikel[i] +
                                        " | " +
                                        preis[i] +
                                        " | " +
                                        i +
                                        " |"
                                    );
                                }
                            }
                            System.out.println();
                            System.out.println(
                                "Bitte geben Sie die Artikelnummer ein, die Sie löschen möchten:"
                            );
                            artikelNummer = scan.nextShort();
                            artikel[artikelNummer] = null;
                            preis[artikelNummer] = 0;
                            System.out.println("Artikel erfolgreich gelöscht");
                            System.out.println();

                            for (int i = 0; i < artikel.length; i++) {
                                if (artikel[i] != null) {
                                    int maxLength = artikel[4].length();
                                    int currentLength = artikel[i].length();

                                    if (currentLength > maxLength) {
                                        maxLength = currentLength;
                                        i = 0;
                                        break;
                                    }

                                    int diff = maxLength - artikel[i].length();

                                    for (int j = 0; j < diff; j++) {
                                        artikel[i] += " ";
                                    }

                                    System.out.println(
                                        "| " +
                                        artikel[i] +
                                        " | " +
                                        preis[i] +
                                        " | " +
                                        i +
                                        " |"
                                    );
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Wartungsmodus beenden");
                            break;
                        default:
                            System.out.println(
                                "Fehler: Ungültige Wartungsmodus Nummer"
                            );
                            break;
                    }

                    break;
                case 1:
                    System.out.println(
                        "Gewählte Atikel Nr. 1 " +
                        artikel[0].trim() +
                        " : " +
                        preis[0] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[0]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[0]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[0]) +
                                "€"
                            );
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
                            " .#@@@:.@@@@..@@@*.."
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    }
                    break;
                case 2:
                    System.out.println(
                        "Gewählte Atikel Nr. 2 " +
                        artikel[1].trim() +
                        " : " +
                        preis[1] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[1]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[1]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[1]) +
                                "€"
                            );
                        }

                        System.out.println(
                            "                                                                 "
                        );
                        System.out.println(
                            "                             --=--=-=                             "
                        );
                        System.out.println(
                            "                             ---:---=                             "
                        );
                        System.out.println(
                            "                             -....::-                             "
                        );
                        System.out.println(
                            "                                                                 "
                        );
                        System.out.println(
                            "                                                                 "
                        );
                        System.out.println(
                            "                            ::.:.:::::                            "
                        );
                        System.out.println(
                            "                           :.........::                           "
                        );
                        System.out.println(
                            "                          ::..........:.                          "
                        );
                        System.out.println(
                            "                          :.....  .....:                          "
                        );
                        System.out.println(
                            "                         :...:.   .... ::                         "
                        );
                        System.out.println(
                            "                         :: .:.   ......-                         "
                        );
                        System.out.println(
                            "                         --:--....----:-=                         "
                        );
                        System.out.println(
                            "                         ---==--+-:-.-.:=                         "
                        );
                        System.out.println(
                            "                         -  ****+.    -==                         "
                        );
                        System.out.println(
                            "                         -.:=.=    # =.-=                         "
                        );
                        System.out.println(
                            "                         -=-:# : + #.*+==                         "
                        );
                        System.out.println(
                            "                         --==:.  **::-:-=                         "
                        );
                        System.out.println(
                            "                         --:-.-+*+*-----=                         "
                        );
                        System.out.println(
                            "                         --:---:::----:-=                         "
                        );
                        System.out.println(
                            "                         :. ...   .:..:.:                         "
                        );
                        System.out.println(
                            "                         :. .........:.:.                         "
                        );
                        System.out.println(
                            "                         :: ..........::                          "
                        );
                        System.out.println(
                            "                         .:.........:..                           "
                        );
                        System.out.println(
                            "                          :.......:.:::                           "
                        );
                        System.out.println(
                            "                          ::.......::.::                          "
                        );
                        System.out.println(
                            "                           .:..........:                          "
                        );
                        System.out.println(
                            "                          .:::..   ....-.                         "
                        );
                        System.out.println(
                            "                         .::..:.. .... .:                         "
                        );
                        System.out.println(
                            "                         ::.............:                         "
                        );
                        System.out.println(
                            "                         ::............::                         "
                        );
                        System.out.println(
                            "                         :::.......... .:                         "
                        );
                        System.out.println(
                            "                         :.:::......::..                          "
                        );
                        System.out.println(
                            "                         .:..:.....:...:                          "
                        );
                        System.out.println(
                            "                          .:::::.::::.:                           "
                        );
                        System.out.println(
                            "                                                                 "
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(
                        "Gewählte Atikel Nr. 3 " +
                        artikel[2].trim() +
                        " : " +
                        preis[2] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[2]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[2]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[2]) +
                                "€"
                            );
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
                            "          `-:::::::::-' \n"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    }
                    break;
                case 4:
                    System.out.println(
                        "Gewählte Atikel Nr. 4 " +
                        artikel[3].trim() +
                        " : " +
                        preis[3] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[3]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[3]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[3]) +
                                "€"
                            );
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
                            "                    +##########################                     \n"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    }
                    break;
                case 5:
                    System.out.println(
                        "Gewählte Atikel Nr. 5 " +
                        artikel[4].trim() +
                        " : " +
                        preis[4] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[4]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[4]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[4]) +
                                "€"
                            );
                        }

                        System.out.println(
                            ".###%%%%=..                                                                                           ..#%%*%%%%%%.\n" +
                            ".%%###%#%%==-..                                                                                     .%%-%%%%%%%%%%.\n" +
                            ".%%%%%%#*%%%###+++++++++++****++++++*+++++*=---====+++*+***+*++++=====--=+**********************######*#%%%%%%###%.\n" +
                            ".#%#####%%#==**#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##%%-\n" +
                            "%#####%%%*%%%%%..%%%%%%%%%%%%%%##########################################################################%%%%%%%%%.\n" +
                            ".%%%%%%%%*%:%%%:%.%%-=%%%%%%%###............  ...................... . .. .......... .....   ....... .##%%%%%%%%%%.\n" +
                            ".%%%%%%%+*#%%+%%%%%%%%#%%%%%###..########.####..##:.####.########.###.####.%######.#######.+%######. ###%%%%%%%%%%.\n" +
                            " %%%%%%+..##%%%%%%%%%%%%%%%%##..###%%###..####.=##.-##%.=#######.:###.###..###.   ###.#%##.###..### -##%%#%%%%%%%%.\n" +
                            " %###%%++*::-:::::::%%%%%%%##. ####.....#%#######.*###.+###.###.%######.. ####   =###.###.-###......##%%%#%%%%####.\n" +
                            ".%##%#%+**::%%%%@%::%%%%%%###. :####%  .##.#####.:###::###......######....#####.+%######..*####.  .##%%%%%%%%%%%%%.\n" +
                            ".%%%%#%+**:::%%#::::%%%%%%##.   .=%##+.%##%####%.####.%##:####.###+##%  *###....###+%##    .####. *##%%%#%%%%%%%%%.\n" +
                            ".%%%%#=+**:--:...:::%%%%%##..=###.###..##.####%..###..###.###.:###.### .###%  ..#######.###.###%..##%%%%%%%%%%%%%%.\n" +
                            ".%%%##=%*%*::....:.*%%%%###.*###.%###*##..####.####.####.###.+###..###..###.  %###.###..###:###..##%%%%%%%%%%%%##%.\n" +
                            ".#%%%#++%%%%%%%%:%%%%%%%## .######%..##% ####%.####..######..####..##########.###..###########..###%%%%%%%%%%%####.\n" +
                            ".%%#%%%+%%%%..%.%%%%%%%##.....................................................................###%%%%%%%%%%%%%##%#.\n" +
                            ".###%%%%*%%%=%.@##%%%%#########################################################################%%#%%%%%%%##%%%%%%%\n" +
                            ".%%##%%#*#%%%%%%%%###############################################################################%%%%%#####%%%%%%%\n" +
                            ".%%%%%##*%%%%#%%%=......   .                     .        .         .              .    .         .%#%%#%%%%%%%%%%.\n" +
                            ".%#%%%%%%%##..                                                                                      .%%#%##%%%%#%%.\n" +
                            " %%#%%%%#.                                                                                             . .#%%%%%%%\n" +
                            "                                                                                                          "
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    }
                    break;
                case 6:
                    System.out.println(
                        "Gewählte Atikel Nr. 6 " +
                        artikel[5].trim() +
                        " : " +
                        preis[5] +
                        "€"
                    );
                    System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                    bezahlung = scan.nextDouble();
                    if (bezahlung < preis[5]) {
                        System.out.println(
                            "Zu wenig bezahlt " + bezahlung + "€"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }
                    } else {
                        if (bezahlung > preis[5]) {
                            System.out.println(
                                "Hier ist Wechselgeld " +
                                (bezahlung - preis[5]) +
                                "€"
                            );
                        }
                        System.out.println(
                            "#########                                                                       ######### \n" +
                            "##########  ############          ##################                          ########### \n" +
                            "#       ################################            #############################       # \n" +
                            "#         ##                                      #### ####     #######   ####-         # \n" +
                            "#                     ###   ##########           ######+###             ##              # \n" +
                            "#                     # ##########   ###    #      #### # ##  #####   #### #      #     # \n" +
                            "#                   ### ######   ##  ### ##  ### ## # # ####### ####### ##    ##  #     # \n" +
                            "#                   ####    ###  # ######## ##### # #-# #  ##  ###  #####      ##       # \n" +
                            "#            ###       ########  ####   # # #   # ##### ##  #### ##    ###  #   ###     # \n" +
                            "#           ##      ####### # ##  #####  ####    ######  #  ### # # ### ####  #   # ### # \n" +
                            "#            ###### #-     +####  ## ###  ######  #### ####  # # ######## # ###   # ### # \n" +
                            "#                 #      # # # ##  ### ##  # ####    #  # #  ## #### #  #    ##   #   # # \n" +
                            "#             ### #          ####  ## # ##   ###### ## ## ####### # ## #  ##### ## #  # # \n" +
                            "#              #  #       # . # ##  #  # ##### ## # ## # #  ##  # ##  #  #          ### # \n" +
                            "#            +####            ####### # ##    ###  #   ## ##  #####     -  #  #######   # \n" +
                            "#          ########       #### ##  #####  #### ###       ##          ###    ######      # \n" +
                            "#                            ##        #####                         #    #####         # \n" +
                            "#############################################################################     # \n" +
                            "######################################################################################### \n" +
                            "#######                                                                           #######"
                        );

                        System.out.println(
                            "Willst du Vorgang wiederholen (ja/nein)"
                        );

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            break; // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                            scan.close();
                            return;
                        }
                    }
                    break;
                default:
                    System.out.println("Ungültige Artikel Nummer");
                    break;
            }
        }
    }
}
