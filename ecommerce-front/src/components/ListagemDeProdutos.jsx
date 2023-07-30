import { useEffect, useState } from "react";
import axios from "axios";

const ListagemDeProdutos = () => {
  const [produtos, setProdutos] = useState([]);

  useEffect(() => {
    axios
      .get(`${process.env.NEXT_PUBLIC_API_URL}/produtos/listar-todos`)
      .then((respostaApi) => setProdutos(respostaApi.data));
  }, []);

  return (
    <>
      <h1>Listagem de produtos</h1>
      <table>
        <thead>
          <tr>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Preço</th>
            <th>Tamanho</th>
          </tr>
        </thead>
        <tbody>
          {produtos.map((cadaProduto) => {
            return (
              <tr key={cadaProduto.id}>
                <td>{cadaProduto.nome}</td>
                <td>{cadaProduto.descricao}</td>
                <td>{cadaProduto.preco}</td>
                <td>{cadaProduto.tamanho}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </>
  );
};

export default ListagemDeProdutos;
