import { useEffect } from "react";

const ListagemDeProdutos = () => {
  useEffect(() => {
    console.log("listagem de produtos");
  }, []);
  return (
    <>
      <h1>listagem de produtos</h1>
    </>
  );
};

export default ListagemDeProdutos;
