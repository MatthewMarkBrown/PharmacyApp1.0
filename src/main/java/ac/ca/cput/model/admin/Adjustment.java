package ac.ca.cput.model.admin;

import java.util.Objects;

public class Adjustment {
    private String expectedCount;

    private Adjustment() {
    }

    private Adjustment(Adjustment.Builder builder) {
        this.expectedCount = builder.expectedCount;
    }

    public String getExpectedCount() {
        return expectedCount;
    }

    public static class Builder {
        private String expectedCount;

        public Adjustment.Builder expectedCount(String expectedCount) {
            this.expectedCount = expectedCount;
            return this;
        }

        public Builder copy(Adjustment adjustment){
            this.expectedCount = adjustment.expectedCount;
            return this;
        }

        public Adjustment build() {
            return new Adjustment(this);

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "expectedCount=" + expectedCount +
                    '}';
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return expectedCount == builder.expectedCount;
        }

        @Override
        public int hashCode() {
            return Objects.hash(expectedCount);
        }
    }
}
