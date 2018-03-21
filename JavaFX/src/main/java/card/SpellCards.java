package card;

//import javafx.scene.image.ImageView;
//
//public class SpellCards extends Card {
//    private String type;
//
//    public SpellCards(ImageView imageCard, String nameCard) {
//        super(imageCard, nameCard);
//    }
//  package card;



import javafx.scene.image.ImageView;


    public class SpellCards extends Card {

        private String type;

        private String glitch;


        public SpellCards(ImageView imageCard, String nameCard, String glitch, String type) {

            super(imageCard, nameCard);

            this.glitch = glitch;

            this.type = type;


        }


        public String getType() {

            return type;

        }

        public void setType(String type) {

            this.type = type;

        }

        public String getGlitch() {

            return glitch;

        }


        public void setGlitch(String glitch) {

            this.glitch = glitch;
        }

    }

