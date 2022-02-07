package ro.fasttrackit.curs16.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonServiceTest {
    @Test
    @DisplayName("WHEN a person is added THEN person count is increased and person has id")
    void testPersonAdd() {
        //SETUP
        PersonService personService = new PersonService();

        //RUN
        Person actual = personService.addPerson(new Person(10, "Bogdan", 33));

        //ASSERT
        assertThat(actual).isEqualTo(1);
        assertThat(personService.count()).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN a person is null THEN throw exception")
    void testPersonAddNull() {
        //SETUP
        PersonService personService = new PersonService();

        //RUN
        assertThrows(IllegalArgumentException.class, () -> personService.addPerson(null));
    }
}