const DetalhesDoProduto = ({ produto }) => {
  return (
    <div>
      <p>ID: {produto.id}</p>
      <p>Nome: {produto.nome}</p>
      <p>Descrição: {produto.descricao}</p>
      <p>Preço: {produto.preco}</p>
      <p>Tamanho: {produto.tamanho}</p>
      <img
        src={produto.urlImagemProduto}
        alt={`detalhes do produto ${produto.id}`}
      />
    </div>
  );
};

export default DetalhesDoProduto;
