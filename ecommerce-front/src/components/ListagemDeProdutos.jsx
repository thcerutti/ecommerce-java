import { useEffect, useState } from "react";
import axios from "axios";
import InsigniaDaMissao from "./InsigniaDaMissao";

const ListagemDeProdutos = () => {
  const [lancamentos, setLancamentos] = useState([]);
  useEffect(() => {
    axios.get("https://api.spacexdata.com/v3/launches").then((respostaApi) => {
      console.log(respostaApi.data);
      setLancamentos(respostaApi.data);
    });
  }, []);

  return (
    <>
      <h1>listagem de produtos</h1>
      <strong>
        <span>algum texto</span>
      </strong>
      {lancamentos.map((cadaLancamento) => {
        return (
          <div key={cadaLancamento.flight_number}>
            <h2>Nome da missão: {cadaLancamento.mission_name}</h2>
            <p>Detalhes da missão: {cadaLancamento.details}</p>
            <p>Ano de lançamento: {cadaLancamento.launch_year}</p>
            <InsigniaDaMissao
              urlInsignia={cadaLancamento.links.mission_patch_small}
            />
          </div>
        );
      })}
    </>
  );
};

export default ListagemDeProdutos;
