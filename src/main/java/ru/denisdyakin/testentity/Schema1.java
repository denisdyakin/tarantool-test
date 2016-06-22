package ru.denisdyakin.testentity;

import org.tarantool.schema.*;

/**
 * Created by ddyakin on 22.06.16.
 */
public class Schema1 {

    @Space
    public SpaceWithPK tester = new SpaceWithPK();

    public class SpaceFields {
        public int id;
        public int text;
    }

    public class SpaceWithPK {
        @SpaceId
        public int id;

        @IndexId
        public int primary;

        @FieldsMapping
        public SpaceFields fields = new SpaceFields();

        @Override
        public String toString() {
            return "SpaceWithPK{" +
                    "id=" + id +
                    ", primary=" + primary +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "TestSchema{" +
                " tester=" + tester +
                '}';
    }

}
