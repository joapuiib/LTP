package exercicis.genericitat.repository;

public class RepositoryUse {
    public static void main(String[] args) {
        InMemoryRepository<Persona> personaRepository = new InMemoryRepository<>();
        personaRepository.insert(new Persona(1, "Joan", 29));
        personaRepository.insert(new Persona(2, "Gala", 22));
        personaRepository.insert(new Persona(3, "Pere", 25));

        System.out.println("INICI");
        System.out.println(personaRepository);
        System.out.println(personaRepository.select(2));

        System.out.println();
        System.out.println("BORRAR");
        Persona pere = personaRepository.delete(3);
        System.out.println(personaRepository);
        System.out.println(pere);

        System.out.println();
        System.out.println("UPDATE");
        Persona oldJoan = personaRepository.update(new Persona(1, "Joan", 30));
        System.out.println(personaRepository);
        System.out.println(oldJoan);
    }
}
