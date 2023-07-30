export default function Home() {
  return (
    <>
      <h2>Página inicial com exemplos de rotas</h2>
      <ul>
        <li>
          <a href={"/produtos"}>Listar todos os produtos</a>
        </li>
        <li>
          <a href={"/produto/1"}>Listar detalhes de um produto específico</a>
        </li>
      </ul>
    </>
  );
}
