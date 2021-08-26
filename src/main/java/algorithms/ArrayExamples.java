package algorithms;

class PersonDto {
    private String personName;
    private String personId;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }
}

class PersonVO {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public class ArrayExamples {

    public static PersonDto map(PersonVO personVO) {
        PersonDto personDto = new PersonDto();
        personDto.setPersonId(personVO.getId());
        personDto.setPersonName(personVO.getName());
        return personDto;
    }

    public static void main(String[] args) {

        PersonVO personVO1 = new PersonVO();
        // personVO1.setId("465465");
        // personVO1.setName("Juan");
        PersonVO personVO2 = new PersonVO();
        personVO2.setId("458888");
        personVO2.setName("Pepe");
        PersonVO personVO3 = new PersonVO();
        personVO3.setId("123465798");
        personVO3.setName("Pedro");
        PersonVO[] persons = {personVO1, personVO2, personVO3};

        for (PersonVO personVO : persons) {

            PersonDto personDto = map(personVO);
            System.out.println(personDto);
            System.out.println(personDto.getPersonId());
            System.out.println(personDto.getPersonName());
        }
    }
}
