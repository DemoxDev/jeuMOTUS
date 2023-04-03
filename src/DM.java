public class DM {

    public static void main(String[] args) {
        String mot, mottrouve;
        int i, x, y, tentativesmax, bienplaces, communs = 0;
        bienplaces = 0;

        mot = Saisie.lire_String("Joueur 1, veuillez saisir le mot à trouver : ");
        x = mot.length();

        if (x<2)
        {
            mot = Saisie.lire_String("Erreur - Le mot doit comporter 2 caracteres au minimum, veuillez resaisir un mot : ");
        }
        tentativesmax = x-2;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        do
        {
            mottrouve = Saisie.lire_String("\nVeuillez saisir un mot : ");
            y = mottrouve.length();
            if (tentativesmax < 1)
            {
                System.out.println("Vous avez perdu. Le mot a trouver etait "+ mot);
            }


            System.out.print("\nLettre(s) communes : ");
            for(i=0; i<x; i++)
            {
                for(int j =0; j <x;j++) {
                    if(mot.substring(i,i+1).equals(mottrouve.substring(j,j+1)))
                    {
                        communs++;
                        System.out.print(mot.substring(i,i+1));
                    }
                }}
            System.out.print("\nLettre(s) bien placés : ");
            for (i=0; i<x; i++)
            {
                if (mot.substring(i,i+1).equals(mottrouve.substring(i,i+1)))
                {
                    bienplaces++;
                    System.out.print(mot.substring(i,i+1));
                }
            }
            System.out.println("\nVous avez "+communs+" lettre(s) communes et "+bienplaces+" lettre(s) bien placées.");
            communs = 0;
            bienplaces = 0;
            if (y<x)
            {
                mottrouve = Saisie.lire_String("Le mot a trouver est plus grand, veuillez resaisir un mot : ");
            }
            else if (y>x)
            {
                mottrouve = Saisie.lire_String("Le mot a trouver est plus petit, veuillez resaisir un mot : ");
            }
            tentativesmax--;
        }while ((!mottrouve.equals("SOL") && tentativesmax>0) && !mot.equals(mottrouve));

        if (mottrouve.equals("SOL"))
        {
            System.out.println("Le mot a trouver est "+ mot);
        }

        if (mot.equals(mottrouve))
        {
            System.out.println("Vous avez gagne !");
        }
        else{
            System.out.println("Vous avez perdu !");
        }
    }

}
