package stringbasics;

public enum GenderOfPet {
        MALE("hím"), FEMALE("nőstény"), UNKNOWN("ismeretlen");

        private String gender;

        GenderOfPet(String gender) {
                this.gender = gender;
        }

        public String getGender() {
                return gender;
        }
}
