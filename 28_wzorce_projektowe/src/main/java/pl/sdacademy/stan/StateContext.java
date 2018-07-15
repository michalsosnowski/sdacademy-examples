package pl.sdacademy.stan;

	class StateContext {
		private StateLike myState;
		StateContext() {
			setState(new StateLowerCase());
		}

		/**
		 * Setter method for the state.
		 * Normally only called by classes implementing the State interface.
		 * @param newState the new state of this context
		 */
		void setState(final StateLike newState) {
			myState = newState;
		}

		void writeName(final String name) {
			myState.writeName(this, name);
		}
	}

