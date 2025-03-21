package Steps;

import Pages.GooglePage;
import Suporte.AbrirNavegadorChrome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoogleStep {

    GooglePage page;
    protected WebDriver driver;

    @Before
    public void setup(){
        driver = AbrirNavegadorChrome.abrirChrome();
        page = new GooglePage(driver);
    }

    @Dado("que eu acesse o site do ecommerce")
    public void que_eu_acesse_o_site_do_ecommerce() throws InterruptedException, IOException {
        page.acessarSite();
    }
    @Quando("eu clicar no icone da lupa e digitar o nome do produto desejado")
    public void eu_clicar_no_icone_da_lupa_e_digitar_o_nome_do_produto_desejado() throws InterruptedException, IOException {
        page.clicarNoCardLaptop();
        page.clicarProduto();
    }

    @Então("certifico que consegui achar o produto")
    public void certifico_que_consegui_achar_o_produto() {
        page.validarProdutoTela();
    }

    @Quando("eu pesquisar o produto e clicar no botão para adicionar no carrinho")
    public void eu_pesquisar_o_produto_e_clicar_no_botão_para_adicionar_no_carrinho() throws InterruptedException, IOException {
        page.clicarNoCardLaptop();
        page.clicarProduto();
        page.adicionarProdutoCarrinho();

    }
    @Então("certifico que o produto foi adicionado com sucesso no carrinho")
    public void certifico_que_o_produto_foi_adicionado_com_sucesso_no_carrinho() throws InterruptedException {
        page.acessarTelaCarrinho();
        page.validarProdutoCarrinho();

    }

    @Quando("eu acessar o carrinho e clicar em remove")
    public void eu_acessar_o_carrinho_e_clicar_em_remove() throws InterruptedException {
        page.clicarNoCardLaptop();
        page.clicarProduto();
        page.adicionarProdutoCarrinho();
        page.acessarTelaCarrinho();
        page.removerProdutoCarrinho();
    }

    @Então("certifico que o produto foi removido do carrinho")
    public void certifico_que_o_produto_foi_removido_do_carrinho() throws InterruptedException {
        page.validarCarrinhoVazio();
    }

    @After
    public void after(){
        driver.quit();
    }
}
