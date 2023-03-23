package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "subject", "writer" })
public class Board implements Comparable<Board> {
	private int boardNo;
	private String subject;
	private String content;
	private String writer;

	@Override
	public int compareTo(Board other) {
		if (this.equals(other))
			return 0;

		int rst1 = subject.compareTo(other.subject);
		int rst2 = writer.compareTo(other.writer);
		
		if (rst1 == 0) {
			if (rst2 == 0)
				return boardNo - other.boardNo;
			return rst2;
		}
		return rst1;
	}

}
