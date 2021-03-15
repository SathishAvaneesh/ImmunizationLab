package com.tracker.saavnera.immunizationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE_IMMUNIZATION);
        String immunizationDetails = null;
        String immunizationTitle = null;

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.immunizationDetail);
        TextView titleText = findViewById(R.id.immunizationTitle);
        switch (message) {
            case "BCG":
                immunizationDetails = "Bacillus Calmette–Guérin vaccine is a vaccine primarily used against tuberculosis. In countries where tuberculosis or leprosy is common, one dose is recommended in healthy babies as close to the time of birth as possible.";
                immunizationTitle = "BCG";
                break;
            case "HiB":
                immunizationDetails = "The Haemophilus influenzae type B vaccine, often called Hib vaccine, is a vaccine used to prevent Haemophilus influenzae type b (Hib) infection. In countries that include it as a routine vaccine, rates of severe Hib infections have decreased more than 90%.";
                immunizationTitle = "HiB";
                break;
            case "OPV 0":
                immunizationDetails = "The first dose of oral polio or any other vaccine is considered as zero dose because the zero refers to the first moment in time when the vaccine is given. The next dose might be called the 1 month or 3-month dose.";
                immunizationTitle = "OPV 0";
                break;
            case "OPV":
                immunizationDetails = "The first dose of oral polio or any other vaccine is considered as zero dose because the zero refers to the first moment in time when the vaccine is given. The next dose might be called the 1 month or 3-month dose.";
                immunizationTitle = "OPV";
                break;
            case "OPV (Oral Polio Vaccine)":
                immunizationDetails = "The first dose of oral polio or any other vaccine is considered as zero dose because the zero refers to the first moment in time when the vaccine is given. The next dose might be called the 1 month or 3-month dose.";
                immunizationTitle = "OPV (Oral Polio Vaccine)";
                break;
            case "Hep-B 1":
                immunizationDetails = "Hepatitis B vaccine. Hepatitis B vaccine is made from parts of the hepatitis B virus. It cannot cause hepatitis B infection. The vaccine is usually given as 3 or 4 shots over a 6-month period";
                immunizationTitle = "Hep-B 1";
                break;
            case "Rotavirus":
                immunizationDetails = "Rotavirus is the most common cause of diarrhoeal disease among infants and young children. It is a genus of double-stranded RNA viruses in the family Reoviridae.";
                immunizationTitle = "Rotavirus";
                break;
            case "Influenza":
                immunizationDetails = "The flu is a contagious respiratory illness caused by influenza viruses that infect the nose, throat, and sometimes the lungs. It can cause mild to severe illness, and at times can lead to death. The best way to prevent the flu is by getting a flu vaccine each year.";
                immunizationTitle = "Influenza";
                break;
            case "HPV (Human Papilloma Virus":
                immunizationDetails = "Human papilloma virus vaccines are vaccines that prevent infection by certain types of human papillomavirus. Available vaccines protect against either two, four, or nine types of HPV.";
                immunizationTitle = "HPV (Human Papilloma Virus";
                break;
            case "Measles":
                immunizationDetails = "Measles vaccine is a vaccine that prevents measles. After one dose 85% of children nine months of age and 95% over twelve months of age are immune. Nearly all of those who do not develop immunity after a single dose develop it after a second dose.";
                immunizationTitle = "Measles";
                break;
            case "Varicella (Chickenpox)":
                immunizationDetails = "Varicella vaccine, also known as chickenpox vaccine, is a vaccine that protects against chickenpox. One dose of vaccine prevents 95% of moderate disease and 100% of severe disease. Two doses of vaccine are more effective than one. ";
                immunizationTitle = "Varicella (Chickenpox)";
                break;
            case "MMR (Measles, Mumps, Rubella)":
                immunizationDetails = "The MMR vaccine is an immunization vaccine against measles, mumps, and rubella. It is a mixture of live attenuated viruses of the three diseases, administered via injection. It was first developed by Maurice Hilleman while at Merck.";
                immunizationTitle = "MMR (Measles, Mumps, Rubella)";
                break;
            case "Pneumococcal Booster":
                immunizationDetails = "CDC recommends pneumococcal vaccination for all children younger than 2 years old and all adults 65 years or older. In certain situations, other children and adults should also get pneumococcal vaccines. Below is more information about who should and should not get each type of pneumococcal vaccine.\n" +
                        "\n" +
                        "Talk to your or your child’s healthcare professional about what is best for your specific situation.";
                immunizationTitle = "Pneumococcal Booster";
                break;
            case "Pneumococcal":
                immunizationDetails = "CDC recommends pneumococcal vaccination for all children younger than 2 years old and all adults 65 years or older. In certain situations, other children and adults should also get pneumococcal vaccines. Below is more information about who should and should not get each type of pneumococcal vaccine.\n" +
                        "\n" +
                        "Talk to your or your child’s healthcare professional about what is best for your specific situation.";
                immunizationTitle = "Pneumococcal Booster";
                break;
            case "IPV (Inactivated Polio Vaccine)":
                immunizationDetails = "Polio vaccines are vaccines used to prevent poliomyelitis. Two types are used: an inactivated poliovirus given by injection and a weakened poliovirus given by mouth";
                immunizationTitle = "IPV (Inactivated Polio Vaccine)";
                break;
            case "OPV (Oral Polio Vaccine) Booster":
                immunizationDetails = "Polio vaccines are vaccines used to prevent poliomyelitis. Two types are used: an inactivated poliovirus given by injection and a weakened poliovirus given by mouth";
                immunizationTitle = "OPV (Oral Polio Vaccine) Booster";
                break;
            case "DPT Booster":
                immunizationDetails = "Children should get 5 doses of DTaP vaccine, one dose at each of the following ages:\n" +
                        "\n" +
                        "✓2 months\n" +
                        "\n" +
                        "✓4 months\n" +
                        "\n" +
                        "✓6 months\n" +
                        "\n" +
                        "✓15-18 months\n" +
                        "\n" +
                        "✓4-6 years\n" +
                        "\n" +
                        "DTaP may be given at the same time as other vaccines.";
                immunizationTitle = "DPT Booster";
                break;
            case "Hepatitis A":
                immunizationDetails = "Hepatitis A vaccine is a vaccine that prevents hepatitis A. It is effective in around 95% of cases and lasts for at least fifteen years and possibly a person's entire life. If given, two doses are recommended beginning after the age of one.";
                immunizationTitle = "Hepatitis A";
                break;
            case "Hepatitis B":
                immunizationDetails = "Hepatitis B vaccine is a vaccine that prevents hepatitis B. The first dose is recommended within 24 hours of birth with either two or three more doses given after that.";
                immunizationTitle = "Hepatitis B";
                break;
            case "Typhoid":
                immunizationDetails = "Inactivated typhoid vaccine (shot) One dose provides protection. It should be given at least 2 weeks before travel to allow the vaccine time to work. A booster dose is needed every 2 years for people who remain at risk";
                immunizationTitle = "Typhoid";
                break;
            case "DPT (Diphtheria Pertussis Tetanus) Booster":
                immunizationDetails = "DPT (also DTP and DTwP) refers to a class of combination vaccines against three infectious diseases in humans: diphtheria, pertussis (whooping cough), and tetanus. The vaccine components include diphtheria and tetanus toxoids and killed whole cells of the bacterium that causes pertussis (wP).";
                immunizationTitle = "DPT (Diphtheria Pertussis Tetanus) Booster";
                break;
            case "DPT (Diphtheria Pertussis Tetanus)":
                immunizationDetails = "DPT (also DTP and DTwP) refers to a class of combination vaccines against three infectious diseases in humans: diphtheria, pertussis (whooping cough), and tetanus. The vaccine components include diphtheria and tetanus toxoids and killed whole cells of the bacterium that causes pertussis (wP).";
                immunizationTitle = "DPT (Diphtheria Pertussis Tetanus) Booster";
                break;


        }

        textView.setText(immunizationDetails);
        titleText.setText(immunizationTitle);
    }
}
