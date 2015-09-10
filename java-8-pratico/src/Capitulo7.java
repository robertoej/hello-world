import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Capitulo7 {
	static List<Usuario> usuarios = new ArrayList<Usuario>();
	/*
	 * 
	 * Tornando moderadores os 10 usuários com mais pontos.
	 */
	public static void c7s1() {
		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		usuarios.subList(0, 10).forEach(Usuario::tornaModerador);
	}
	/*
	 * 
	 * Tornando moderadores os usuários com mais de 100 pontos.
	 */
	public static void c7s2() {
		Stream<Usuario> stream = usuarios.stream();
		stream.filter(u -> u.getPontos() > 100).forEach(Usuario::tornaModerador);;
	}
	/*
	 * 
	 * Obtendo a lista de volta.
	 */
	public static void c7s3() {
		List<Usuario> maisQue100 = new ArrayList<Usuario>();
		
		Stream<Usuario> stream = usuarios.stream();
		stream.filter(u -> u.getPontos() > 100).forEach(maisQue100::add);
	}
	/*
	 * 
	 * Listando apenas os pontos de todos os usuários com o Map.
	 */
	public static void c7s6() {
		List<Integer> pontos = usuarios.stream().map(Usuario::getPontos).collect(Collectors.toList());
	}
	/*
	 * 
	 * Listando apenas os pontos de todos os usuários com o Map. (sem autoboxing)
	 */
	public static void c7s7() {
		IntStream pontos = usuarios.stream().mapToInt(Usuario::getPontos);
	}
}
