-- MySQL Script generated by MySQL Workbench
-- qui 24 mai 2018 06:50:44 -03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema merenda
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `merenda` ;

-- -----------------------------------------------------
-- Schema merenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `merenda` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;
USE `merenda` ;

-- -----------------------------------------------------
-- Table `merenda`.`funcao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`funcao` ;

CREATE TABLE IF NOT EXISTS `merenda`.`funcao` (
  `id_funcao` INT NOT NULL AUTO_INCREMENT,
  `funcao` VARCHAR(45) NULL,
  PRIMARY KEY (`id_funcao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`usuario` ;

CREATE TABLE IF NOT EXISTS `merenda`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `id_funcao` INT NOT NULL,
  `nome` VARCHAR(80) NULL,
  `cpf` VARCHAR(11) NULL,
  `matricula` VARCHAR(20) NULL,
  `senha` VARCHAR(45) NULL,
  `permissao` CHAR(1) NULL,
  `usuario` VARCHAR(45) NULL,
  PRIMARY KEY (`id_usuario`, `id_funcao`),
  INDEX `fk_usuario_funcao1_idx` (`id_funcao` ASC),
  CONSTRAINT `fk_usuario_funcao1`
    FOREIGN KEY (`id_funcao`)
    REFERENCES `merenda`.`funcao` (`id_funcao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`tipo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`tipo` ;

CREATE TABLE IF NOT EXISTS `merenda`.`tipo` (
  `id_tipo` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`id_tipo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`instituicao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`instituicao` ;

CREATE TABLE IF NOT EXISTS `merenda`.`instituicao` (
  `id_instituicao` INT NOT NULL AUTO_INCREMENT,
  `id_tipo` INT NOT NULL,
  `nome` VARCHAR(80) NULL,
  `inep` VARCHAR(8) NULL,
  `endereco` VARCHAR(120) NULL,
  `diretor` VARCHAR(80) NULL,
  `qtd_alunos` INT(11) NULL,
  `id_usuario` INT NOT NULL,
  `id_funcao` INT NOT NULL,
  PRIMARY KEY (`id_instituicao`, `id_tipo`),
  INDEX `fk_instituicao_tipo1_idx` (`id_tipo` ASC),
  INDEX `fk_instituicao_usuario1_idx` (`id_usuario` ASC, `id_funcao` ASC),
  CONSTRAINT `fk_instituicao_tipo1`
    FOREIGN KEY (`id_tipo`)
    REFERENCES `merenda`.`tipo` (`id_tipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_instituicao_usuario1`
    FOREIGN KEY (`id_usuario` , `id_funcao`)
    REFERENCES `merenda`.`usuario` (`id_usuario` , `id_funcao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`item` ;

CREATE TABLE IF NOT EXISTS `merenda`.`item` (
  `id_item` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NULL,
  `tipo` VARCHAR(1) NULL,
  `qtd_atende` INT(11) NULL,
  PRIMARY KEY (`id_item`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`lote`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`lote` ;

CREATE TABLE IF NOT EXISTS `merenda`.`lote` (
  `id_lote` INT NOT NULL AUTO_INCREMENT,
  `id_item` INT NOT NULL,
  `preco` FLOAT NULL,
  `qtd_itens` INT(11) NULL,
  `data_validade` DATE NULL,
  PRIMARY KEY (`id_lote`),
  INDEX `fk_lote_item1_idx` (`id_item` ASC),
  CONSTRAINT `fk_lote_item1`
    FOREIGN KEY (`id_item`)
    REFERENCES `merenda`.`item` (`id_item`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`nota_fiscal`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`nota_fiscal` ;

CREATE TABLE IF NOT EXISTS `merenda`.`nota_fiscal` (
  `id_nota_fiscal` INT NOT NULL AUTO_INCREMENT,
  `data_emissao` DATE NULL,
  `imagem` BLOB NULL,
  PRIMARY KEY (`id_nota_fiscal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`entrega`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`entrega` ;

CREATE TABLE IF NOT EXISTS `merenda`.`entrega` (
  `id_entrega` INT NOT NULL AUTO_INCREMENT,
  `id_nota_fiscal` INT NOT NULL,
  `id_instituicao` INT NOT NULL,
  `data_entrega` DATE NULL,
  `fornecedor` VARCHAR(45) NULL,
  PRIMARY KEY (`id_entrega`, `id_nota_fiscal`),
  INDEX `fk_entrega_nota_fiscal1_idx` (`id_nota_fiscal` ASC),
  INDEX `fk_entrega_instituicao1_idx` (`id_instituicao` ASC),
  CONSTRAINT `fk_entrega_nota_fiscal1`
    FOREIGN KEY (`id_nota_fiscal`)
    REFERENCES `merenda`.`nota_fiscal` (`id_nota_fiscal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrega_instituicao1`
    FOREIGN KEY (`id_instituicao`)
    REFERENCES `merenda`.`instituicao` (`id_instituicao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`cardapio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`cardapio` ;

CREATE TABLE IF NOT EXISTS `merenda`.`cardapio` (
  `id_cardapio` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NULL,
  `data_cardapio` DATE NULL,
  PRIMARY KEY (`id_cardapio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`entrada`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`entrada` ;

CREATE TABLE IF NOT EXISTS `merenda`.`entrada` (
  `id_entrada` INT NOT NULL AUTO_INCREMENT,
  `id_entrega` INT NOT NULL,
  `id_nota_fiscal` INT NOT NULL,
  `id_estoque_anterior` INT NOT NULL,
  `qtd_remanejo` INT(11) NULL,
  PRIMARY KEY (`id_entrada`),
  INDEX `fk_entrada_entrega1_idx` (`id_entrega` ASC, `id_nota_fiscal` ASC),
  INDEX `fk_entrada_estoque1_idx` (`id_estoque_anterior` ASC),
  CONSTRAINT `fk_entrada_entrega1`
    FOREIGN KEY (`id_entrega` , `id_nota_fiscal`)
    REFERENCES `merenda`.`entrega` (`id_entrega` , `id_nota_fiscal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrada_estoque1`
    FOREIGN KEY (`id_estoque_anterior`)
    REFERENCES `merenda`.`estoque` (`id_estoque`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`saida`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`saida` ;

CREATE TABLE IF NOT EXISTS `merenda`.`saida` (
  `id_saida` INT NOT NULL AUTO_INCREMENT,
  `qtd_remanejo` INT(11) NULL,
  `qtd_usado` INT(11) NULL,
  `qtd_ata` INT(11) NULL,
  PRIMARY KEY (`id_saida`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`estoque`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`estoque` ;

CREATE TABLE IF NOT EXISTS `merenda`.`estoque` (
  `id_estoque` INT NOT NULL AUTO_INCREMENT,
  `id_entrada` INT NOT NULL,
  `id_saida` INT NOT NULL,
  `qtd_atual` INT(11) NULL,
  `data_estoque` DATE NULL,
  PRIMARY KEY (`id_estoque`),
  INDEX `fk_estoque_entrada1_idx` (`id_entrada` ASC),
  INDEX `fk_estoque_saida1_idx` (`id_saida` ASC),
  CONSTRAINT `fk_estoque_entrada1`
    FOREIGN KEY (`id_entrada`)
    REFERENCES `merenda`.`entrada` (`id_entrada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_estoque_saida1`
    FOREIGN KEY (`id_saida`)
    REFERENCES `merenda`.`saida` (`id_saida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `merenda`.`encomenda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `merenda`.`encomenda` ;

CREATE TABLE IF NOT EXISTS `merenda`.`encomenda` (
  `id_lote` INT NOT NULL,
  `id_entrega` INT NOT NULL,
  `id_nota_fiscal` INT NOT NULL,
  PRIMARY KEY (`id_lote`, `id_entrega`, `id_nota_fiscal`),
  INDEX `fk_lote_has_entrega_entrega1_idx` (`id_entrega` ASC, `id_nota_fiscal` ASC),
  INDEX `fk_lote_has_entrega_lote1_idx` (`id_lote` ASC),
  CONSTRAINT `fk_lote_has_entrega_lote1`
    FOREIGN KEY (`id_lote`)
    REFERENCES `merenda`.`lote` (`id_lote`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_lote_has_entrega_entrega1`
    FOREIGN KEY (`id_entrega` , `id_nota_fiscal`)
    REFERENCES `merenda`.`entrega` (`id_entrega` , `id_nota_fiscal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
