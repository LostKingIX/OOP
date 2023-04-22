public class Grade 
    {
        /*
         * letterGrade method will round off the input thatw as received as userInput to a whole number and
         * return a whole number. It will return a letter grade based on the pre-defined grade
         * double validGradeInput - user's inputted percentage
         * @return "X" letter grade 
         */
        static String letterGrade(double validGradeInput) 
        {
            // Round the percentage to a whole number
            int roundedPercentage = (int) Math.round(validGradeInput);

            // Determine the letter grade based on the rounded percentage
            if (roundedPercentage >= 90 && roundedPercentage <= 100) 
                {
                    return "A+";
                } 
            else if (roundedPercentage >= 85 && roundedPercentage < 90) 
                {
                    return "A";
                } 
            else if (roundedPercentage >= 80 && roundedPercentage < 85) 
                {
                    return "A-";
                } 
            else if (roundedPercentage >= 75 && roundedPercentage < 80) 
                {
                    return "B+";
                } 
            else if (roundedPercentage >= 70 && roundedPercentage < 75) 
                {
                    return "B";
                } 
            else if (roundedPercentage >= 65 && roundedPercentage < 70) 
                {
                    return "B-";
                } 
            else if (roundedPercentage >= 60 && roundedPercentage < 65) 
                {
                    return "C";
                } 
            else if (roundedPercentage >= 55 && roundedPercentage < 60) 
                {
                    return "D+";
                } 
            else if (roundedPercentage >= 50 && roundedPercentage < 55) 
                {
                    return "D";
                } 
            else 
                {
                    return "F";
                }
        }

        /*
        * gradeFeedback is designed to take a parameter (lettergrade) from the letterGrade() method and return a corresponding
        * feedback based on that
        * @return " " feedback 
        */
        static String gradeFeedback(String letterGrade) 
            {
                // Using a Switch Case, determine the feedback based on the letter grade
                switch (letterGrade) 
                    {
                        case "A+":
                            return "Outstanding";

                        case "A":
                            return "Exemplary";

                        case "A-":
                            return "Excellent";

                        case "B+":
                            return "Very Good";

                        case "B":
                            return "Good";

                        case "B-":
                            return "Satisfactory";

                        case "C":
                            return "Acceptable";

                        case "D+":
                            return "Conditional Pass";
                        case "D-":
                            return "Conditional Pass";
                        default:
                            return "Fail";
                    }
            }
    }
