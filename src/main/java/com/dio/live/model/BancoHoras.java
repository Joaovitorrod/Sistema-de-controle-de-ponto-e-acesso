package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {
	@AllArgsConstructor
	@NoArgsConstructor
	@EqualsAndHashCode
	@Embeddable
	public class BancoHorasId implements Serializable {
		private Long idBancoHoras;
		private Long idMovimento;
		private Long idUsuario;
	}
	@EmbeddedId
	private BancoHorasId id;
	private LocalDateTime dataTrabalhada;
	private Long quantidadeHoras;
	private Long saldoHoras;
	//private CategoriaUsuario categoriaUsuario;
}
