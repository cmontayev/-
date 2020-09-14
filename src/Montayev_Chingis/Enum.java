package Montayev_Chingis;

public enum Enum {
        I("I", 1), II("I", 2),III("I", 3), IV("IV", 4),V("V", 5),
        private int value;
        private String key;

        Enum(String key, int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
            public String getKey() {
                return key;
            }

            int toInt(String key) {
                for (Enum i: this.values())
                    if (i.getKey().equals(key))
                        return i.getValue();

                return 1;
            }

}
