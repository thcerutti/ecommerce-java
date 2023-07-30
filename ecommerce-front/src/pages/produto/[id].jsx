import { useEffect, useState } from "react";
import { useRouter } from "next/router";
import axios from "axios";
import apiConstants from "@/constants";
import DetalhesDoProduto from "@/components/DetalhesDoProduto";

const PaginaDetalheProduto = () => {
  const router = useRouter();
  const [produto, setProduto] = useState({});

  useEffect(() => {
    axios
      .get(`${apiConstants.API_URL}/produtos/detalhes`)
      .then((response) => setProduto(response.data));
  }, []);

  return (
    <>
      <h1>detalhes - Produto ID: {router.query.id}</h1>
      <DetalhesDoProduto produto={produto} />
    </>
  );
};

export default PaginaDetalheProduto;
