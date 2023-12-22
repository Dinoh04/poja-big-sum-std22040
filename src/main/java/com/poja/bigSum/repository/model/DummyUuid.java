package com.poja.bigSum.repository.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import com.poja.bigSum.PojaGenerated;

@PojaGenerated
@Entity
@Getter
@Setter
public class DummyUuid {
  @Id private String id;
}
