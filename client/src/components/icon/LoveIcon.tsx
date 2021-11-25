import React from 'react';
import { ReactComponent as LoveSVG } from 'assets/icons/love.svg';

interface LoveIconProps {
  size?: number;
  color?: string;
}

function LoveIcon({ size, color }: LoveIconProps): JSX.Element {
  return <LoveSVG width={size} height={size} stroke={color} stroke-width="0.5" />;
}

export default LoveIcon;
